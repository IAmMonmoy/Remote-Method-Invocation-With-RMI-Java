import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class rm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	 Add add=new Add();
			AddInterface stub=(AddInterface)UnicastRemoteObject.exportObject(add, 0);
			Registry registry = LocateRegistry.createRegistry(2001);
			registry.bind("Add", stub);
			System.out.println("Server1 Ready");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
