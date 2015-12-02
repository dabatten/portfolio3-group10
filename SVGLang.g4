grammar SVGLang;

options {
  language = Java; // antlr will generate java lexer and parser
}

@header {
 	import java.awt.Color;
 	import util.SVGparser;
}

@members {
	int width = 0;
	int height = 0;
	int radius = 0;
	int x = 0;
	int y = 0;
	int red = 0;
	int green = 0;
	int blue = 0;
	Color c = new Color(red, green, blue);
	SVGparser svg = new SVGparser();

}


//--------------------Lexer Rules---------------------

//primitives
INT : [0-9]+ {System.out.println("found INT : " + getText());};
//COMMENT : '//'STRING {System.out.println("found COMMENT : " + getText());};
WS : [ \r\t\n]+ {skip();}; 
fragment ALPHA : [a-zA-Z .!?];
//STRING : (ALPHA|INT)+ {System.out.println("found STRING : " + getText());};
SEMI : ';';

TEXT : 'text' {System.out.println("found TEXT");};

//shapes
CIRCLE : 'circle' {System.out.println("found CIRCLE");};
RECTANGLE : 'rectangle' {System.out.println("found RECTANGLE");};
LINE : 'line' {System.out.println("found LINE");};
POLYGON : 'polygon' {System.out.println("found POLYGON");};

//colors
RED : 'red' {System.out.println("found RED");};
BLUE : 'blue';
YELLOW : 'yellow';
GREEN : 'green';
BLACK : 'black';
WHITE : 'white';


//--------------------Parser Rules---------------------

start : (command SEMI)* ;

command : shape | line ;


shape : rect | circle ;


rect : RECTANGLE INT{width = $INT.int;} INT {height = $INT.int;}location color {svg.newRectangle(width,height,x,y,c);} ;

circle : CIRCLE INT {radius = $INT.int;} location color {System.out.println("color:" + c.toString());};

line : LINE location location color;

color : RED {c = Color.red;} 
	| BLUE {c = Color.blue;}
	| YELLOW {c = Color.yellow;}
	| GREEN {c = Color.green;}
	| BLACK {c = Color.black;}
	| WHITE {c = Color.white;}
	| 'RGB('INT{red = $INT.int;}','INT{green = $INT.int;}','INT{blue = $INT.int;}')' {c = new Color(red, green, blue);};

location : '(' INT {x = $INT.int;} ',' INT {y = $INT.int;} ')';

