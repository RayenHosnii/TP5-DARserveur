package rmiServeur;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;

public class ConversionServeur {

    public static void main(String[] args) throws RemoteException, MalformedURLException {

        // Create RMI registry on port 1099
        LocateRegistry.createRegistry(1099);

        // Create an instance of the remote object (
        ConversionImpl od=new ConversionImpl();//od:objet distant
		System.out.println(od.toString());
		Naming.rebind("rmi://localhost:1099/objetdistant",od);
		
}
}