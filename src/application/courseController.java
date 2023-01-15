package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class courseController implements Initializable {
	 @FXML
	    public AnchorPane pane1;
	
	  @FXML
	    private Pane SubmitPane;
	  @FXML
	    private AnchorPane pane;
    @FXML
    private TableView<Entry> Table1;
	@FXML
	private TableView<Entry> Table2;

	  
	@FXML
	private Button ADDCOURSE;
	@FXML
	private Button REMOVECOURSE;
	@FXML
	private TableColumn<Entry, Integer> NO1;
	@FXML
	private TableColumn<Entry, String> C1;
	@FXML
	private TableColumn<Entry, Integer> CREDIT1;
	@FXML
	private TableColumn<Entry, Integer> NO2;
	@FXML
	private TableColumn<Entry, String> C2;
	@FXML
	private TableColumn<Entry, Integer> CREDIT2;
	@FXML
	private ComboBox<String> SELECTCOURSE;
	@FXML
	private TextField SURNAME;
	@FXML
	private TextField REG;
	@FXML
	private TextField OTHERS;
	@FXML
	private ComboBox<String> DEPT;
	@FXML
	private ComboBox<String> M_O_E;
	@FXML
	private ComboBox<String> GENDER;
	@FXML
	private ComboBox<String> LEVEL;
	@FXML
	private ComboBox<String> SOO;
	@FXML
	private ComboBox<String> LGA;
	@FXML
	private TextField PHONE;
	@FXML
	private TextField EMAIL;
	@FXML
	private Label Ent_reg;
	@FXML
	private Label sur_ent;
	@FXML
	private Label other_ent;
	@FXML
	private Label Gender_ent;
	@FXML
	private Label phone_ent;
	@FXML
	private Label email_ent;
	@FXML
	private Label Lga_ent;
	@FXML
	private Label soo_ent;
	@FXML
	private Label MoE_ent;
	@FXML
	private Label Dept_ent;
	@FXML
	private Label level_ent;
	@FXML
	private TableView<Entry>  table1_ent;
	@FXML
	private TableColumn<Entry, Integer> SN_Ent;
	@FXML
	private TableColumn<Entry, Integer> CD_ent;
	@FXML
	private TableColumn<Entry, Integer> credit_ent;
	@FXML
	private TableColumn<Entry, Integer> course_title;
	@FXML
	private TableView<Entry> table2_ent;
	@FXML
	private TableColumn<Entry, Integer> SN2_Ent1;
	@FXML
	private TableColumn<Entry, Integer> CD2_ent1;
	@FXML
	private TableColumn<Entry, Integer> credit2_ent1;
	@FXML
	private TableColumn<Entry, Integer> course_title2;
	public String selectedCourse="";
	ObservableList<Entry> table1;
	ObservableList<Entry> table2;
	String DeptSelected="null";
	String LevelSelected="null";
	int x=1;
	int y=1;
	
	
	
	    
 
		 
	// Event Listener on Button[#ADDCOURSE].onAction
		 @FXML
		    void onSubmit(ActionEvent event) throws SQLException {
			
			 
			 
			 
			 
			 
			 pane1.setVisible(true);
			 pane.setVisible(true);
			 
			 Action.temp_storage(REG.getText(), SURNAME.getText(),OTHERS.getText(),GENDER.getSelectionModel().getSelectedItem().toString(),PHONE.getText(),EMAIL.getText(),SOO.getSelectionModel().getSelectedItem().toString(),M_O_E.getSelectionModel().getSelectedItem().toString(),DEPT.getSelectionModel().getSelectedItem().toString(),LEVEL.getSelectionModel().getSelectedItem().toString());
			 
			 Ent_reg.setText(Action.detailsS.get("Mode-of-Entry"));
			 sur_ent.setText(Action.detailsS.get("Surname"));
			 other_ent.setText(Action.detailsS.get("Othernames"));
			 Gender_ent.setText(Action.detailsS.get("Gender"));
			 phone_ent.setText(Action.detailsS.get("Phone-Number"));
			 email_ent.setText(Action.detailsS.get("Email"));
			 
			 soo_ent.setText(Action.detailsS.get("State-of-Origin"));
			 MoE_ent.setText(Action.detailsS.get("Mode-of-Entry"));
			 Dept_ent.setText(Action.detailsS.get("Department"));
			 level_ent.setText(Action.detailsS.get("Level"));
			
				
			 
			 
			
			 

		    }
	@FXML
	public void onAddClick(ActionEvent event) throws SQLException{
		x=1;
		y=1;
		
		
		/*Main openNewpage = new Main();
		openNewpage.put("/view/login.fxml");
		Routing.paginate.push("/view/login.fxml");
		openNewpage.start((Stage)pane.getScene().getWindow());
		*/
		String course=SELECTCOURSE.getSelectionModel().getSelectedItem().toString();
		
		loadTables(course);
		
		//Temporary storage course code selected
		//Action.courseCodeChoice.add();
		
		
		
	}
	 
	
	@FXML
   void onSelectDeptView(ActionEvent event) throws SQLException {
		 DeptSelected=DEPT.getSelectionModel().getSelectedItem().toString();
		 SELECTCOURSE.getItems().clear();
		 
		 new Database(DeptSelected,LevelSelected).getCourse().forEach(data ->{
			 SELECTCOURSE.getItems().add(data[0]);
			 
			
		 });
		
		}
	
	
	@FXML
	   public void onSelectLevel(ActionEvent event) throws SQLException {
			LevelSelected=LEVEL.getSelectionModel().getSelectedItem().toString();
			SELECTCOURSE.getItems().clear();
			new Database(DeptSelected,LevelSelected).getCourse().forEach(data ->{
				SELECTCOURSE.getItems().add(data[0]);
			});
			
	    }
	
	
		
	@FXML
	public void onAdd(ActionEvent event) {
		
		
	}

	
	@FXML
	public void onPRINTClick(ActionEvent event) {
		
	}
	
	
    @FXML
	void table1_act(MouseEvent event) {
    	

	}

	@FXML
	void table2_act(MouseEvent event) {

	}
	public void ctrl_load_table(String action,String course_) throws SQLException {
		if(action.equalsIgnoreCase("remove")) {
			loadTables(course_);
		}
		if(action.equalsIgnoreCase("add")){
			loadTables(course_);
		}
		
	}
	
	public void loadTables(String course) throws SQLException {
		
		String cs=new Database(course).getSemester();
		//semester confirmed as first
		if(cs.equals("1st")) {
		     if(Action.courseCodeChoice.contains(course)){
		    	 System.out.println("it contains");
		     }else {
		    	 Action.courseCodeChoice.add(course);
		 		
		 		table1=FXCollections.observableArrayList();

		 		
		 		Action.courseCodeChoice.forEach(coursechosen->{
		 			try {
		 				table1.add(new Entry(x,new Database(coursechosen).getCreditLoad(),coursechosen));
		 			} catch (SQLException e) {
		 				// TODO Auto-generated catch block
		 				e.printStackTrace();
		 			}
		 			x++;
		 		});
		 		
		 		 
		 		NO1.setCellValueFactory(new PropertyValueFactory<Entry,Integer>("number"));
		 		CREDIT1.setCellValueFactory(new PropertyValueFactory<Entry,Integer>("creditLoad"));
		 		C1.setCellValueFactory(new PropertyValueFactory<Entry, String>("courseCode"));
		 		
		 		Table1.setItems(table1);	
		     }
		
		}
		//confirmed as 
		else {
			if(Action.courseCodeChoice2.contains(course)) {
				
			}else {
				Action.courseCodeChoice2.add(course);
				table2=FXCollections.observableArrayList();

				
				Action.courseCodeChoice2.forEach(coursechosen->{
					try {
						table2.add(new Entry(y,new Database(coursechosen).getCreditLoad(),coursechosen));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					y++;
				});
				 
				NO2.setCellValueFactory(new PropertyValueFactory<Entry,Integer>("number"));
				CREDIT2.setCellValueFactory(new PropertyValueFactory<Entry,Integer>("creditLoad"));
				C2.setCellValueFactory(new PropertyValueFactory<Entry, String>("courseCode"));
				
				Table2.setItems(table2);	
				
			}
			
		}
		
		
	}
	

   
	
	// Event Listener on Button[#REMOVECOURSE].onAction
    
    
	@FXML
	public void onRemoveClick(ActionEvent event) {
			Action.courseCodeChoice.forEach(course->{
			if(course.contains(Table1.getSelectionModel().getSelectedItem().courseCode)) {
				Action.courseCodeChoice.remove(Table1.getSelectionModel().getSelectedIndex());
				table1.remove(Table1.getSelectionModel().getSelectedIndex());
			}
		});
			Action.courseCodeChoice2.forEach(course->{
			if(course.contains(Table2.getSelectionModel().getSelectedItem().courseCode)) {
				Action.courseCodeChoice2.remove(Table2.getSelectionModel().getSelectedIndex());
				table2.remove(Table2.getSelectionModel().getSelectedIndex());
			}
		});
		
		
	
		
		
		
		/*
		Table1.getSelectionModel().getSelectedIndex();
		Action.courseCodeChoice.remove(Table1.getSelectionModel().getSelectedIndex());
		table1.remove(Table1.getSelectionModel().getSelectedIndex());
		*/
		
		// TODO Autogenerated
	}
	// Event Listener on ComboBox[#SELECTCOURSE].onAction
	
	
	
	@FXML
	public void OnSelectCourseClick(ActionEvent event) {
		
		
		// TODO Autogenerated
	
	
	}
	

	 @FXML
	 void OnSelectStateview(ActionEvent event) {
		
          String StateSelected=SOO.getSelectionModel().getSelectedItem().toString();
          LGA.getItems().clear();
          LGA.getItems().addAll(Details._LGAChooser(StateSelected));
          
	 } 

	    
	 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Action.register();
		// TODO Auto-generated method stub
	 try {
		DEPT.getItems().addAll(new Database().getDept());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		DEPT.getItems().add("Issues with database connection");
	}
	 
	 ObservableList<String> Modebox=FXCollections.observableArrayList("UTME","Direct Entry","Transfer");
	 M_O_E.setItems(Modebox);
	 
	 
	 ObservableList<String>Genderbox=FXCollections.observableArrayList("Male","Female");
	 GENDER.setItems(Genderbox);
	 ObservableList<String> Levellist=FXCollections.observableArrayList("100","200","300","400","500");
	 LEVEL.setItems(Levellist);
	 
	 SOO.getItems().addAll(Details.state_NG);
	 
	
	}
}
