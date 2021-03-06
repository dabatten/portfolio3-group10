grammar SVGLang;

options {
  language = Java; // antlr will generate java lexer and parser
}

@header {
 	import java.awt.Color;
 	import util.SVGparser;
}

@members {
	//rect and circle
	int width = 0;
	int height = 0;
	int radius = 0;
	int x = 0;
	int y = 0;
	
	//line
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	
	//rgb
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

start : (command SEMI)* {svg.buildFile();} ;

command : shape | line ;


shape : rect | circle ;


rect : RECTANGLE INT{width = $INT.int;} INT {height = $INT.int;}location color {svg.newRectangle(width,height,x,y,c);} ;

circle : CIRCLE INT {radius = $INT.int;} location color {svg.newCircle(radius,x,y,c);} ;

line : LINE start_point end_point color {svg.newLine(x1,y1,x2,y2,c);} ;

color : RED {c = Color.red;} 
	| BLUE {c = Color.blue;}
	| YELLOW {c = Color.yellow;}
	| GREEN {c = Color.green;}
	| BLACK {c = Color.black;}
	| WHITE {c = Color.white;}
	| 'RGB('INT{red = $INT.int;}','INT{green = $INT.int;}','INT{blue = $INT.int;}')' {c = new Color(red, green, blue);};

location : '(' INT {x = $INT.int;} ',' INT {y = $INT.int;} ')';

start_point : '(' INT {x1 = $INT.int;} ',' INT {y1 = $INT.int;} ')';
end_point : '(' INT {x2 = $INT.int;} ',' INT {y2 = $INT.int;} ')';

