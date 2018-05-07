//This class interfaces directly between the client and the server
import java.rmi.*;
public interface RMIServerInterface extends Remote {
	
	public int registerNode() throws RemoteException;
	public void uploadFileToServer(byte[] mydata, String serverpath, int length) throws RemoteException;
	public Integer[] getPeersForFile(String fileName) throws RemoteException;

}