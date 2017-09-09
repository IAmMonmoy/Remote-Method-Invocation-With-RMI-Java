import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ArrayInterfaceSort extends Remote {
 int[] arraySort(int ara[], int araSize) throws RemoteException; //here int[] means returns array .. 

}
