import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class rm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            Sub sub=new Sub();
			SubInterface stub1=(SubInterface)UnicastRemoteObject.exportObject(sub, 0);
			Registry registry = LocateRegistry.createRegistry(2002);
			registry.bind("Sub",stub1);
			System.out.println("Server2 Ready");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
