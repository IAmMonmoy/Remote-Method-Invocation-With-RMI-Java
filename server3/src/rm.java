import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class rm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            arrayAdd ara =new arrayAdd();
			ArrayInterfaceAdd stub1=(ArrayInterfaceAdd)UnicastRemoteObject.exportObject(ara, 0);
			Registry registry = LocateRegistry.createRegistry(2003);
			registry.bind("arrayAdd",stub1);
			System.out.println("Server3 Ready");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
