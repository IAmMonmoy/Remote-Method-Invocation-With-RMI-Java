import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ArrayInterfaceAdd extends Remote {
 int arrayAdd(int ara[], int araSize) throws RemoteException;

}
