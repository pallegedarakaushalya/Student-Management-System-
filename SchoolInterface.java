import java.rmi.*;

public interface SchoolInterface extends Remote{
	
	//ABSTRACT METHODS
	public int sum(int m1,int m2,int m3) throws RemoteException;
	public float avg() throws RemoteException;
	public int state() throws RemoteException;


	//ABSTRACT SET METHODS TO INITIALIZE 
	public void setName(String name) throws RemoteException;
	public void setId(int id) throws RemoteException;
	public void setGrade(int grade) throws RemoteException;
	public void setAddress(String address) throws RemoteException;


	//ABSTRACT GET METHODS TO RETURN DETAILS
	public String getName() throws RemoteException;
	public int getId() throws RemoteException;
	public int getGrade() throws RemoteException;
	public String getAddress() throws RemoteException;



}