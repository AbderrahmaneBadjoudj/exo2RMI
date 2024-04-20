package service ;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

class ObjetCalculServer {
    public static void main(String[] args) {
        try {
            IObjetCalcul obj = new ObjetCalcul();
            LocateRegistry.createRegistry(6666);
            Naming.rebind("//localhost:6666/ObjetCalcul", obj);
            IObjetString ob = new ObjetString();
            Naming.rebind("//localhost:6666/ObjetString", ob);
            System.out.println("ObjetCalcul bound in registry");
        } catch (Exception e) {
            System.out.println("ObjetCalculServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}