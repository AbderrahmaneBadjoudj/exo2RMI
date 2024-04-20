package service ;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;


class ObjetStringServer {
    public static void main(String[] args) {
        try {
            IObjetString obj = new ObjetString();
            LocateRegistry.createRegistry(4444);
            Naming.rebind("//localhost:4444/ObjetString", obj);
            System.out.println("ObjetString bound in registry");
        } catch (Exception e) {
            System.out.println("ObjetStringServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}