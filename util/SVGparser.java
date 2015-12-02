package util;

import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class SVGparser {

	private ArrayList<String> svgList = new ArrayList<String>();
	
	public SVGparser(){
		this.svgList = new ArrayList<String>();
	}
	
	//convert string array to xml file
	public void buildFile(){
		File f = new File("svg.xml");
		//FileWriter fw = new FileWriter(f);
		//for each svg item add to file
		//TODO
	}
	
	//parse commands to svg
		//circle
		public void newCircle(int r, int x , int y, Color c){
			
		}
		
		//rectangle
		public void newRectangle(int w, int h, int x, int y, Color c){
			String s = "<rect width='" + w + "' height='" + h + "' style='" + colorToCSS(c) + "' />";
			System.out.println(s);
			svgList.add(s);
		}
		
		//line
		public void newLine(int x1, int y1, int x2, int y2, Color c){
		
		}
		
		private String colorToCSS (Color c){
			int r = c.getRed();
			int g = c.getGreen();
			int b = c.getBlue();
			String s = "fill:rgb(" + r + "," + g + "," + b + ")";
			return s;
		}
	
}