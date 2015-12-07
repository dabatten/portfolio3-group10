package util;

import java.awt.Color;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SVGparser {

	private ArrayList<String> svgList = new ArrayList<String>();
	
	public SVGparser(){
		this.svgList = new ArrayList<String>();
	}
	
	//convert string array to xml file
	public void buildFile(){
		try{
			File f = new File("svg.txt");
			PrintWriter pw = new PrintWriter(f);
			//for each svg item add to file
			for(int i = 0; i < svgList.size(); i++){
				pw.println(svgList.get(i));
			}
			pw.flush();
			pw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//parse commands to svg
		//circle
		public void newCircle(int r, int x , int y, Color c){
			String s = "<circle r='" + r + "' cx='" + x + "' cy='" + y + "' style='fill:" + colorToCSS(c) + "' />";
			System.out.println(s);
			svgList.add(s); 
			
		}
		
		//rectangle
		public void newRectangle(int w, int h, int x, int y, Color c){
			String s = "<rect width='" + w + "' height='" + h + "' x='" + x + "' y='" + y + "' style='fill:" + colorToCSS(c) + "' />";
			System.out.println(s);
			svgList.add(s);
		}
		
		//line
		public void newLine(int x1, int y1, int x2, int y2, Color c){
			String s = "<line x1='" + x1 + "' y1='" + y1 + "' x2='" + x2 + "' y2='" + y2 
				+ "' style='stroke:" + colorToCSS(c) + ";stroke-width:5' />";
			System.out.println(s);
			svgList.add(s);
		}
		
		private String colorToCSS (Color c){
			int r = c.getRed();
			int g = c.getGreen();
			int b = c.getBlue();
			String s = "rgb(" + r + "," + g + "," + b + ")";
			return s;
		}
	
}