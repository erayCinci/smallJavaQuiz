package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UnitTest {
	
	static ArrayList<Comment> commentArr = new ArrayList<Comment>();
	Comment testComment = new Comment(1,"some comment",1);
	
	@Test
	public void testingComment() {
		String expect = "some comment";
		String actual = testComment.getBody();
		assertEquals(expect,actual);
	}	
}
