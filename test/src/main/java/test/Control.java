package test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;

@Controller
public class Control {

    static ArrayList<Comment> commentArr = new ArrayList<Comment>();
    
	public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://my-json-server.typicode.com/typicode/demo/comments")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        Parsing parsing = new Parsing();
        parsing.parse(response.body(), commentArr);
        CreateFile newFile = new CreateFile();
        newFile.start();
        newFile.writeToFile(commentArr); 
    }	
}