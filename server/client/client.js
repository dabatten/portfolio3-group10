$(document).ready(function(){

	//connect new websocket
	var socket = io.connect();
		

	
	//add draw button event handler
	$("button").on('click', function () {
		var code = $("textarea").val();
		console.log('code', code);
		socket.emit('draw'); //TODO add code to emit

	});

	


});