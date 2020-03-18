package test;

import java.io.File;  
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class CreateFile {
	
	public void start() {
	    try {
	      File file = new File("comments.txt");
	      if (file.createNewFile()) {
	        System.out.println("File created: " + file.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	      
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	
	public void writeToFile(ArrayList<Comment> comment) throws IOException {
		try {
		      FileWriter writer = new FileWriter("comments.txt");		   
		      for(int i = 0; i < comment.size(); i++) {
		    	  writer.write(comment.get(i).getId() + "," + comment.get(i).getBody() + "," + comment.get(i).getPostId() + "\n");
		      }		      
		      writer.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
	}	
}
