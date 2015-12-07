var appPort = 5000; //listen on port 5000

//create new express server
var express = require('express');
var app = express();
var http = require('http');
var server = http.createServer(app);


//set up express server
app.use(express.static(__dirname + '/client'));

//render home screen
app.get('/', function(req, res){
	res.sendFile('index.html'); 
});

server.listen(appPort); 
console.log('Server listening on port : ' + appPort);

//websocket module
var io = require('socket.io').listen(server);

//file reading modules
var fs = require('fs');
var lr = require('line-reader');

//promise module
var promise = require('bluebird');
var eachLine = promise.promisify(lr.eachLine); //add a promise to eachLine()

//check operating system
var os = require('os');
//console.log(os.platform() + " | " + os.type());
var invalid_os = (os.platform() != "darwin" && os.platform() != "linux");
if (invalid_os) console.log("This program only supports Mac OSX and Linux!");


//use unix commands
var exec = require('child_process').exec;
function puts(error, stdout, stderr) {
	console.log(stdout); 
}
//exec("ls", puts);

io.sockets.on('connection', function(socket){
	console.log('new connection!');
	
	socket.on('draw', function(){
		console.log('server draw');
		var svg = "";
		//read each line and store in string
		eachLine('svg.txt', function(line, last){
			svg += line;	
			if(last) console.log(svg);
		}).then(function(){
			//update client
			socket.emit('svg', svg);
		});
	});
	
	socket.on('code', function(code){
		//overwrite SVGLang input file
		fs.writeFile('test.in', code);
		//run "java org.antlr.v4.runtime.misc.TestRig SVGLang start < test.in"
		exec("java org.antlr.v4.runtime.misc.TestRig SVGLang start < test.in", function(){
			console.log('redraw');
			socket.emit('redraw');
		});
	});
	
	//TODO

});

