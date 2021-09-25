package application;
	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	String course1,course2,course3,course4, course5;
	double credit1, credit2,credit3,credit4,credit5;
	double grade1,grade2,grade3,grade4,grade5;
	@Override
	public void start(Stage s) {
		//elements
		Label title1 = new Label("Student Name: ");
		Label title2 = new Label("Student ID: ");
		
		
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		Label lb1 = new Label("Course 1");
		Label lb2 = new Label("Course 2");
		Label lb3 = new Label("Course 3");
		Label lb4 = new Label("Course 4");
		Label lb5 = new Label("Course 5");
		
		
		ComboBox<String> cr1 = new ComboBox<String>();
		cr1.setPromptText("Select Course");
		cr1.getItems().addAll("ENG102", "ENG103", "ENG111", "BEN205","PHI104", "HIS102", "HIS103", "ECO101", "ECO104", "POL101", "POL104", "SOC101", "ANT101", "ENV203", "GEO205", "CSE115", "CSE115L", "MAT361", "MAT125", "BIO103", "PHY107", "CHE101", "MAT116", "MAT120", "MAT130", "MAT250", "MAT361", "MAT125", "MAT350", "PHY107", "PHY108", "CHE101", "EEE452", "CEE110", "CSE115", "CSE115L", "CSE173", "CSE215", "CSE215L", "CSE225", "CSE225L", "CSE231", "CSE231L", "EEE141", "EEE141L", "EEE111", "EEE111L", "CSE311", "CSE311L", "CSE323", "CSE327", "CSE331", "CSE331L", "CSE373", "CSE332", "CSE425", "CSE299", "CSE499A", "CSE499B", "CSE498", "CSE401", "CSE417", "CSE418", "CSE426", "CSE473", "CSE491", "CSE411", "CSE427", "CSE428", "CSE429", "CSE492", "CSE422", "CSE438", "CSE482", "CSE485", "CSE486", "CSE493", "CSE433", "CSE435", "CSE413", "CSE414", "CSE415", "CSE494", "CSE440", "CSE445", "CSE465", "CSE467", "CSE470", "CSE419", "CSE446", "CSE447", "CSE448", "CSE449", "CSE442", "CSE496");
		
		cr1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				course1 = cr1.getValue();
			}
		});
		
		ComboBox<Double> crd1 = new ComboBox<Double>();
		crd1.setPromptText("Select Credit");
		crd1.getItems().addAll(1.0,1.5,3.0);
		crd1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				credit1 = crd1.getValue();
			}
		});
		
		ComboBox<String> grd1 = new ComboBox<String>();
		grd1.setPromptText("Select Grade");
		grd1.getItems().addAll("A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F");
		grd1.setOnAction(new EventHandler<ActionEvent>() {
			String grade;
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				grade = grd1.getValue();
				if(grade == "A") {
					grade1 = 4.0;
				}
				else if(grade == "A-") {
					grade1 = 3.7;
				}
				else if(grade == "B+") {
					grade1 = 3.3;
				}
				else if(grade == "B") {
					grade1 = 3.0;
				}
				else if(grade == "B-") {
					grade1 = 2.7;
				}
				else if(grade == "C+") {
					grade1 = 2.3;
				}
				else if(grade == "C") {
					grade1 = 2.0;
				}
				else if(grade == "C-") {
					grade1 = 1.7;
				}
				else if(grade == "D+") {
					grade1 = 1.3;
				}
				else if(grade == "D") {
					grade1 = 1.0;
				}
				else if(grade == "F") {
					grade1 = 0;
				}
				
			}
		});
		
	
		
		ComboBox<String> cr2 = new ComboBox<String>();
		cr2.setPromptText("Select Course");
		cr2.getItems().addAll("ENG102", "ENG103", "ENG111", "BEN205","PHI104", "HIS102", "HIS103", "ECO101", "ECO104", "POL101", "POL104", "SOC101", "ANT101", "ENV203", "GEO205", "CSE115", "CSE115L", "MAT361", "MAT125", "BIO103", "PHY107", "CHE101", "MAT116", "MAT120", "MAT130", "MAT250", "MAT361", "MAT125", "MAT350", "PHY107", "PHY108", "CHE101", "EEE452", "CEE110", "CSE115", "CSE115L", "CSE173", "CSE215", "CSE215L", "CSE225", "CSE225L", "CSE231", "CSE231L", "EEE141", "EEE141L", "EEE111", "EEE111L", "CSE311", "CSE311L", "CSE323", "CSE327", "CSE331", "CSE331L", "CSE373", "CSE332", "CSE425", "CSE299", "CSE499A", "CSE499B", "CSE498", "CSE401", "CSE417", "CSE418", "CSE426", "CSE473", "CSE491", "CSE411", "CSE427", "CSE428", "CSE429", "CSE492", "CSE422", "CSE438", "CSE482", "CSE485", "CSE486", "CSE493", "CSE433", "CSE435", "CSE413", "CSE414", "CSE415", "CSE494", "CSE440", "CSE445", "CSE465", "CSE467", "CSE470", "CSE419", "CSE446", "CSE447", "CSE448", "CSE449", "CSE442", "CSE496");
		cr2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				course2 = cr2.getValue();
			}
		});
		
		ComboBox<Double> crd2 = new ComboBox<Double>();
		crd2.setPromptText("Select Credit");
		crd2.getItems().addAll(1.0,1.5,3.0);
		crd2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				credit2 = crd2.getValue();
			}
		});
		
		ComboBox<String> grd2 = new ComboBox<String>();
		grd2.setPromptText("Select Grade");
		grd2.getItems().addAll("A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F");
		grd2.setOnAction(new EventHandler<ActionEvent>() {
			String grade;
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				grade = grd2.getValue();
				if(grade == "A") {
					grade2 = 4.0;
				}
				else if(grade == "A-") {
					grade2 = 3.7;
				}
				else if(grade == "B+") {
					grade2 = 3.3;
				}
				else if(grade == "B") {
					grade2 = 3.0;
				}
				else if(grade == "B-") {
					grade2 = 2.7;
				}
				else if(grade == "C+") {
					grade2 = 2.3;
				}
				else if(grade == "C") {
					grade2 = 2.0;
				}
				else if(grade == "C-") {
					grade2 = 1.7;
				}
				else if(grade == "D+") {
					grade2 = 1.3;
				}
				else if(grade == "D") {
					grade2 = 1.0;
				}
				else if(grade == "F") {
					grade2 = 0;
				}
				
			}
		});	
		
		
		
		ComboBox<String> cr3 = new ComboBox<String>();
		cr3.setPromptText("Select Course");
		cr3.getItems().addAll("ENG102", "ENG103", "ENG111", "BEN205","PHI104", "HIS102", "HIS103", "ECO101", "ECO104", "POL101", "POL104", "SOC101", "ANT101", "ENV203", "GEO205", "CSE115", "CSE115L", "MAT361", "MAT125", "BIO103", "PHY107", "CHE101", "MAT116", "MAT120", "MAT130", "MAT250", "MAT361", "MAT125", "MAT350", "PHY107", "PHY108", "CHE101", "EEE452", "CEE110", "CSE115", "CSE115L", "CSE173", "CSE215", "CSE215L", "CSE225", "CSE225L", "CSE231", "CSE231L", "EEE141", "EEE141L", "EEE111", "EEE111L", "CSE311", "CSE311L", "CSE323", "CSE327", "CSE331", "CSE331L", "CSE373", "CSE332", "CSE425", "CSE299", "CSE499A", "CSE499B", "CSE498", "CSE401", "CSE417", "CSE418", "CSE426", "CSE473", "CSE491", "CSE411", "CSE427", "CSE428", "CSE429", "CSE492", "CSE422", "CSE438", "CSE482", "CSE485", "CSE486", "CSE493", "CSE433", "CSE435", "CSE413", "CSE414", "CSE415", "CSE494", "CSE440", "CSE445", "CSE465", "CSE467", "CSE470", "CSE419", "CSE446", "CSE447", "CSE448", "CSE449", "CSE442", "CSE496");
		cr3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				course3 = cr3.getValue();
			}
		});
		
		ComboBox<Double> crd3 = new ComboBox<Double>();
		crd3.setPromptText("Select Credit");
		crd3.getItems().addAll(1.0,1.5,3.0);
		crd3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				credit3 = crd3.getValue();
			}
		});
		
		ComboBox<String> grd3 = new ComboBox<String>();
		grd3.setPromptText("Select Grade");
		grd3.getItems().addAll("A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F");
		grd3.setOnAction(new EventHandler<ActionEvent>() {
			String grade;
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				grade = grd3.getValue();
				if(grade == "A") {
					grade3 = 4.0;
				}
				else if(grade == "A-") {
					grade3 = 3.7;
				}
				else if(grade == "B+") {
					grade3 = 3.3;
				}
				else if(grade == "B") {
					grade3 = 3.0;
				}
				else if(grade == "B-") {
					grade3 = 2.7;
				}
				else if(grade == "C+") {
					grade3 = 2.3;
				}
				else if(grade == "C") {
					grade3 = 2.0;
				}
				else if(grade == "C-") {
					grade3 = 1.7;
				}
				else if(grade == "D+") {
					grade3 = 1.3;
				}
				else if(grade == "D") {
					grade3 = 1.0;
				}
				else if(grade == "F") {
					grade3 = 0;
				}
				
			}
		});	
		
		
		
		ComboBox<String> cr4 = new ComboBox<String>();
		cr4.setPromptText("Select Course");
		cr4.getItems().addAll("ENG102", "ENG103", "ENG111", "BEN205","PHI104", "HIS102", "HIS103", "ECO101", "ECO104", "POL101", "POL104", "SOC101", "ANT101", "ENV203", "GEO205", "CSE115", "CSE115L", "MAT361", "MAT125", "BIO103", "PHY107", "CHE101", "MAT116", "MAT120", "MAT130", "MAT250", "MAT361", "MAT125", "MAT350", "PHY107", "PHY108", "CHE101", "EEE452", "CEE110", "CSE115", "CSE115L", "CSE173", "CSE215", "CSE215L", "CSE225", "CSE225L", "CSE231", "CSE231L", "EEE141", "EEE141L", "EEE111", "EEE111L", "CSE311", "CSE311L", "CSE323", "CSE327", "CSE331", "CSE331L", "CSE373", "CSE332", "CSE425", "CSE299", "CSE499A", "CSE499B", "CSE498", "CSE401", "CSE417", "CSE418", "CSE426", "CSE473", "CSE491", "CSE411", "CSE427", "CSE428", "CSE429", "CSE492", "CSE422", "CSE438", "CSE482", "CSE485", "CSE486", "CSE493", "CSE433", "CSE435", "CSE413", "CSE414", "CSE415", "CSE494", "CSE440", "CSE445", "CSE465", "CSE467", "CSE470", "CSE419", "CSE446", "CSE447", "CSE448", "CSE449", "CSE442", "CSE496");
		cr4.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				course4 = cr4.getValue();
			}
		});
		
		ComboBox<Double> crd4 = new ComboBox<Double>();
		crd4.setPromptText("Select Credit");
		crd4.getItems().addAll(1.0,1.5,3.0);
		crd4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				credit4 = crd4.getValue();
			}
		});
		
		ComboBox<String> grd4 = new ComboBox<String>();
		grd4.setPromptText("Select Grade");
		grd4.getItems().addAll("A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F");
		grd4.setOnAction(new EventHandler<ActionEvent>() {
			String grade;
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				grade = grd4.getValue();
				if(grade == "A") {
					grade4 = 4.0;
				}
				else if(grade == "A-") {
					grade4 = 3.7;
				}
				else if(grade == "B+") {
					grade4 = 3.3;
				}
				else if(grade == "B") {
					grade4 = 3.0;
				}
				else if(grade == "B-") {
					grade4 = 2.7;
				}
				else if(grade == "C+") {
					grade4 = 2.3;
				}
				else if(grade == "C") {
					grade4 = 2.0;
				}
				else if(grade == "C-") {
					grade4 = 1.7;
				}
				else if(grade == "D+") {
					grade4 = 1.3;
				}
				else if(grade == "D") {
					grade4 = 1.0;
				}
				else if(grade == "F") {
					grade4 = 0;
				}
				
			}
		});	
		
		
		ComboBox<String> cr5 = new ComboBox<String>();
		cr5.setPromptText("Select Course");
		cr5.getItems().addAll("ENG102", "ENG103", "ENG111", "BEN205","PHI104", "HIS102", "HIS103", "ECO101", "ECO104", "POL101", "POL104", "SOC101", "ANT101", "ENV203", "GEO205", "CSE115", "CSE115L", "MAT361", "MAT125", "BIO103", "PHY107", "CHE101", "MAT116", "MAT120", "MAT130", "MAT250", "MAT361", "MAT125", "MAT350", "PHY107", "PHY108", "CHE101", "EEE452", "CEE110", "CSE115", "CSE115L", "CSE173", "CSE215", "CSE215L", "CSE225", "CSE225L", "CSE231", "CSE231L", "EEE141", "EEE141L", "EEE111", "EEE111L", "CSE311", "CSE311L", "CSE323", "CSE327", "CSE331", "CSE331L", "CSE373", "CSE332", "CSE425", "CSE299", "CSE499A", "CSE499B", "CSE498", "CSE401", "CSE417", "CSE418", "CSE426", "CSE473", "CSE491", "CSE411", "CSE427", "CSE428", "CSE429", "CSE492", "CSE422", "CSE438", "CSE482", "CSE485", "CSE486", "CSE493", "CSE433", "CSE435", "CSE413", "CSE414", "CSE415", "CSE494", "CSE440", "CSE445", "CSE465", "CSE467", "CSE470", "CSE419", "CSE446", "CSE447", "CSE448", "CSE449", "CSE442", "CSE496");
		cr5.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				course5 = cr5.getValue();
			}
		});
		
		ComboBox<Double> crd5 = new ComboBox<Double>();
		crd5.setPromptText("Select Credit");
		crd5.getItems().addAll(1.0,1.5,3.0);
		crd5.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				credit5 = crd5.getValue();
			}
		});
		
		ComboBox<String> grd5 = new ComboBox<String>();
		grd5.setPromptText("Select Grade");
		grd5.getItems().addAll("A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F");
		grd5.setOnAction(new EventHandler<ActionEvent>() {
			String grade;
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				grade = grd5.getValue();
				if(grade == "A") {
					grade5 = 4.0;
				}
				else if(grade == "A-") {
					grade5 = 3.7;
				}
				else if(grade == "B+") {
					grade5 = 3.3;
				}
				else if(grade == "B") {
					grade5 = 3.0;
				}
				else if(grade == "B-") {
					grade5 = 2.7;
				}
				else if(grade == "C+") {
					grade5 = 2.3;
				}
				else if(grade == "C") {
					grade5 = 2.0;
				}
				else if(grade == "C-") {
					grade5 = 1.7;
				}
				else if(grade == "D+") {
					grade5 = 1.3;
				}
				else if(grade == "D") {
					grade5 = 1.0;
				}
				else if(grade == "F") {
					grade5 = 0;
				}
				
			}
		});	
		
		
		
		Button btn = new Button("Calculate");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String name = tf1.getText().toString();
				int id = Integer.parseInt(tf2.getText().toString());
				
				
				double creditSum = credit1 + credit2 + credit3 + credit4 + credit5 ;
				
				
				double cgpa = ((grade1 * credit1) + (grade2 * credit2) + (grade3 * credit3) + (grade4 * credit4) + (grade5 * credit5))/creditSum;
				
				File file = new File("info.txt");
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					FileWriter fw = new FileWriter("info.txt");
					fw.write("Student Name: " + name + " \n");
					fw.write("Student ID: "+ id  + " \n");
					fw.write(course1 + " " + credit1 + " " + grade1 + " \n");
					fw.write(course2 + " " + credit2 + " " + grade2 + " \n");
					fw.write(course3 + " " + credit3 + " " + grade3 + " \n");
					fw.write(course4 + " " + credit4 + " " + grade4 + " \n");
					fw.write(course5 + " " + credit5 + " " + grade5 + " \n");
					fw.write("CGPA: " + cgpa);
					fw.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Label showData = new Label("CGPA: " + cgpa);
				HBox hb = new HBox(10, showData);
				hb.setAlignment(Pos.CENTER);
				
				Scene sc = new Scene(hb, 300,200);
				s.setTitle("Calculated Data");
				s.setScene(sc);
				s.show();
				
			}
		});
		
		
		//layout 
		
		HBox hb1 = new HBox(15, title1, tf1, title2, tf2);
		hb1.setAlignment(Pos.TOP_CENTER);
		
		HBox hb2 = new HBox(15, lb1, cr1, crd1, grd1);

		
		HBox hb3 = new HBox(15, lb2, cr2, crd2, grd2);
		
		HBox hb4 = new HBox(15, lb3, cr3, crd3, grd3);
		
		HBox hb5 = new HBox(15, lb4, cr4, crd4, grd4);

		HBox hb6 = new HBox(15, lb5, cr5, crd5, grd5);

		
		HBox hb7 = new HBox(0, btn);
		hb7.setAlignment(Pos.CENTER);

		
		

		
		VBox vb = new VBox(20, hb1, hb2, hb3, hb4, hb5, hb6, hb7);

		
		//scenes
		Scene sc = new Scene(vb, 600, 400);
		
		//stages
		s.setTitle("CGPA Calculator");
		s.setScene(sc);
		s.show();
				
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
