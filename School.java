import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;


public class School extends UnicastRemoteObject implements SchoolInterface {
	public School() throws RemoteException{}

	//CREATE FIELDS
	private String name;
	private int id;
	private int grade;
	private String address;

	//FIELDS FOR CALCULATION METHOD
	public int sum;
	public float avg;

		//INITIALIZE FIELDS 
			//NAME
			public void setName(String name){
				this.name = name;
			}
			

			//ID
			public void setId(int id){
				this.id = id;
			}
			

			//GRADE
			public void setGrade(int grade){
				this.grade = grade;
			}
			

			//ADDRESS
			public void setAddress(String address){
				this.address = address;
			}

		//CALCULATE MARKS
			//TO CALCLATE MARKS
			public int sum(int a, int b, int c){
				sum = a+b+c;
				return sum;
			}

			//TO CALCULATE AVERAGE
			public float avg(){
				avg = sum / 3;
				return avg;
			}

			public int state(){
				if(avg>50){
					return 1;
				}else{
					return 0;
				}
			}

		//RETURN STUDENT DETAILS

			public String getName(){
				return name;
			}

			public int getId(){
				return id;
			}

			public int getGrade(){
				return grade;
			}

			public String getAddress(){
				return address;
			}

}