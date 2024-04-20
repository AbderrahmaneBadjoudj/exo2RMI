package service ;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

class Client {
    public static void main(String[] args) {
        try {
            LocateRegistry.getRegistry(6666);
            IObjetString stringObj = (IObjetString) Naming.lookup("//localhost:6666/ObjetString");
            IObjetCalcul calculObj = (IObjetCalcul) Naming.lookup("//localhost:6666/ObjetCalcul");

            int occurrences = stringObj.NbOccurrences("HelloWorld", 'l');
            int sum = calculObj.add(20, 30);

            System.out.println("Occurrences of 'l' in 'HelloWorld': " + occurrences);
            System.out.println("Sum of 20 and 30 = " + sum);
        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}