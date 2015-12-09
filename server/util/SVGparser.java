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
			System.out.println("build file");
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
		public void newCircle(float r, float x , float y, Color c){
			String s = "<circle r='" + r + "' cx='" + x + "' cy='" + y + "' style='fill:" + colorToCSS(c) + "' />";
			System.out.println(s);
			svgList.add(s); 
			
		}
		
		//rectangle
		public void newRectangle(float w, float h, float x, float y, Color c){
			String s = "<rect width='" + w + "' height='" + h + "' x='" + x + "' y='" + y + "' style='fill:" + colorToCSS(c) + "' />";
			System.out.println(s);
			svgList.add(s);
		}
		
		//line
		public void newLine(float x1, float y1, float x2, float y2, Color c){
			String s = "<line x1='" + x1 + "' y1='" + y1 + "' x2='" + x2 + "' y2='" + y2 
				+ "' style='stroke:" + colorToCSS(c) + ";stroke-width:5' />";
			System.out.println(s);
			svgList.add(s);
		}
		
		private String colorToCSS (Color c){
			int r = c.getRed();
			int g = c.getGreen();
			int b = c.getBlue();
			//if color out of bounds throw error TODO
			if((r > 255 || r < 0) || (b > 255 || b < 0) || (g > 255 || g < 0)){
				System.out.println("color out of bounds");
			}
			String s = "rgb(" + r + "," + g + "," + b + ")";
			return s;
		}
	
}