import java.rmi.Naming;


public class SchoolServer{
	public static void main(String[] args) {
		try{
			School obschool = new School();
			Naming.rebind("myscl", obschool);
			System.out.println("Server is Running....");

		}catch(Exception e){
			System.out.println("Error "+e);
		}
	}
}