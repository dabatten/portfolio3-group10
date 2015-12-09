$(document).ready(function(){

	//connect new websocket
	var socket = io.connect();
		
	
	//add draw button event handler
	$("#draw").on('click', function () {
		console.log('draw');
		socket.emit('draw'); //TODO add code to emit

	});
	
	//add code button event handler
	$("#code").on('click', function () {
		var code = $("textarea").val();
		console.log('code', code);
		socket.emit('code', code); //TODO add code to emit

	});

	socket.on('svg', function(elements){
		console.log('client svg', elements);
		//append new elements
		$('svg').html(elements);
		$('#output p').text(elements);

	});
	
	socket.on('redraw', function(){
		socket.emit('draw');
	});
	



});