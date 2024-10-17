import java.rmi.Naming;
import java.util.Scanner;


public class SchoolClient{
	public static void main(String[] args) {
		try{
			SchoolInterface scl = (SchoolInterface)Naming.lookup("myscl");
			Scanner scn = new Scanner(System.in);


			boolean exit = true;

			while(exit){
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Welcome to ABC School<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				
				System.out.println("\t1.Add New Stdent.");
				System.out.println("\t2.Calculate Stdent Marks.");
				System.out.println("\t3.Retrive Students details Stdent.");
				System.out.println("\tSelect OPtion to continue:");

				int op = scn.nextInt();
				switch(op){

					//INITIALIZED VALUE
					case 1:
						scn.nextLine();
						System.out.print("Enter Student name: ");
						String name = scn.nextLine();
						scl.setName(name);

						System.out.print("Enter Student ID: ");
						int id = scn.nextInt();
						scl.setId(id);

						System.out.print("Enter Student Grade: ");
						int grade = scn.nextInt();
						scl.setGrade(grade);

						scn.nextLine();
						System.out.print("Enter Student Address: ");
						String add = scn.nextLine();
						scl.setAddress(add);

						break;
					//CALCULAT SUDENT MARKS
					case 2:

						System.out.print("Enter Sub 1: ");
						int m1 = scn.nextInt();

						System.out.print("Enter Sub 2: ");
						int m2 = scn.nextInt();

						System.out.print("Enter Sub 3: ");
						int m3 = scn.nextInt();

						System.out.println("Summation of your marks : "+scl.sum(m1, m2, m3));
						System.out.println("Average of your marks : "+scl.avg());
						int state = scl.state();

						if(state == 1){
							System.out.println("You Have pass the exam, Conragulation!");
						}else{
							System.out.println("You Haven't pass the exam, Try your best in next time!");
						}
						break;
					case 3:
						System.out.println(">>>>>>>>Welcomes to Students Details<<<<<<<<");
						System.out.println("Sudent Name: "+scl.getName());
						System.out.println("Sudent Id: "+scl.getId());
						System.out.println("Sudent Grade: "+scl.getGrade());
						System.out.println("Sudent Address: "+scl.getAddress());
						break;
					default:
						System.out.println("ERROR.....Please enter valid Input!!!!");


				}



				System.out.print("\tIf you want to continue enter true if not enter false: ");
				exit = scn.nextBoolean();

			}

		}catch(Exception e){
			System.out.println("Error "+e);
		}

	}
}