package test;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Parsing {
	
	public void parse(String body, ArrayList<Comment> commentArr) 
	{
		JSONArray comments = new JSONArray(body);
		for(int i = 0; i < comments.length(); i++)
		{
			JSONObject comment = comments.getJSONObject(i);
			Comment commenExample = new Comment(comment.getInt("id"),comment.getString("body"),comment.getInt("postId"));
			commentArr.add(commenExample);			
		}
	}
}
