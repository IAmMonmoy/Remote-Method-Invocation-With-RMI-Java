import java.rmi.RemoteException;

public class arrayAdd implements ArrayInterfaceAdd {

	public int arrayAdd(int[] ara, int araSize) throws RemoteException {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i < araSize; i++)
		{
			sum = sum + ara[i];
		}
		return sum;
	}

	

}
