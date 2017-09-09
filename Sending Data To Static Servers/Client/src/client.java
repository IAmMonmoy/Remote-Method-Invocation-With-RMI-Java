import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
			try {
				Registry registry = LocateRegistry.getRegistry(2001);
				Registry registry1 = LocateRegistry.getRegistry(2002);
				Registry registry2 = LocateRegistry.getRegistry(2003);
				Registry registry3 = LocateRegistry.getRegistry(2004);

				
			    AddInterface stub = (AddInterface) registry.lookup("Add");
				SubInterface stub1 = (SubInterface) registry1.lookup("Sub");
				ArrayInterfaceAdd stub2 = (ArrayInterfaceAdd) registry2.lookup("arrayAdd");
				ArrayInterfaceSort stub3 = (ArrayInterfaceSort) registry3.lookup("arraySort");
			    
				
				int[] ara = {5,1,4,2,3}; //if sir tells to take input. comment this line and uncomment next block
				
				   /*Scanner sc=new Scanner(System.in);
				   System.out.println("Enter How Many Number");
				   int number = sc.nextInt();
				   
				   int[] ara = new int[100];
				   
				   for(int i = 0; i < number; i++)
				   {
					   ara[i] = sc.nextInt();
				   }*/
				   
				 
				
				System.out.println(stub.add(2, 3));
			    System.out.println(stub1.sub(3, 2));
			    
			    System.out.println("Result for array add");
			    
			    System.out.println(stub2.arrayAdd(ara, 5));
			    
			    System.out.println("Result for array sort");
			    
			    int[] result = new int[100]; //returns a array
			    result = stub3.arraySort(ara, 5);
			    
			    for(int i = 0; i < 5; i++)
			    {
			    	System.out.println(result[i]);
			    }
			
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Client exception: " + e.toString());
				e.printStackTrace();
			}
	}

}
