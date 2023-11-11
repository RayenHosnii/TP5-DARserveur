package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion{// unicastremoteobjects est un skeleton

	public ConversionImpl() throws RemoteException {//protected si la classe conversiopnservice exsiste dans le package 
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public double conversion(double mt)throws RemoteException {
		
		return mt*3.3;
		
	}

}
