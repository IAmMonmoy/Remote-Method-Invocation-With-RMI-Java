import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class rm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            arraySort ara =new arraySort();
			ArrayInterfaceSort stub1=(ArrayInterfaceSort)UnicastRemoteObject.exportObject(ara, 0);
			Registry registry = LocateRegistry.createRegistry(2004);
			registry.bind("arraySort",stub1);
			System.out.println("Server4 Ready");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
