package application;

import java.util.HashMap;
import java.util.Stack;

public class Routing {
	static HashMap<String,String> routes;
	static Stack<String> paginate;
	
	
	void registerRoutes() {
		routes.put("/", "/view/course.fxml");
		routes.put("/sec", "/view/course.fxml");
	}
	
	void stackLinks(String links) {
		paginate.push(links);
	}
	
	static HashMap<String,String> getRoutes(){
		return routes;
	}

}
