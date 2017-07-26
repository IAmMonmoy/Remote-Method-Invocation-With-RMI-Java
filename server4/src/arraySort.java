import java.rmi.RemoteException;

public class arraySort implements ArrayInterfaceSort {

	public int[] arraySort(int[] ara, int araSize) throws RemoteException { //int[] means returns array or sorted integers
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i < araSize; i++)
		{
			for(int j = 0; j < araSize; j++)
			{
				if(ara[i]>ara[j]) //if bigger then swap the two
				{
					int temp = ara[i];
					ara[i] = ara[j];
					ara[j] = temp;
				}
			}
		}
		return ara;
	}

	

}
