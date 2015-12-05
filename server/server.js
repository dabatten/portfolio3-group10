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


var io = require('socket.io').listen(server);

var fs = require('fs');
var lr = require('line-reader');

var svg = "";

io.sockets.on('connection', function(socket){
	console.log('new connection!');
	
	socket.on('draw', function(){
		lr.eachLine('svg.txt', function(line, last){
			svg += line;	
			if(last) console.log(svg);
		});
	});
	
	//TODO

});

