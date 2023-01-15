package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	String initialRoute="/view/course.fxml";
	String url=initialRoute;
	
	
	
	void put(String url) {
		this.url=url;
		
	}
		
		
		
	
	@Override
	public void start(Stage primaryStage) {
		
				
		try {
			Parent root = FXMLLoader.load(getClass().getResource(url));
			
			Scene scene = new Scene(root);
		
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}