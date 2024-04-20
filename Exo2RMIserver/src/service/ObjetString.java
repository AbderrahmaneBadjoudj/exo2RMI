package service ;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
class ObjetString extends UnicastRemoteObject implements IObjetString {
    public ObjetString() throws RemoteException {
    }

    public int NbOccurrences(String mot, char c) throws RemoteException {
        try {
            int count = 0;
            for (int i = 0; i < mot.length(); i++) {
                if (mot.charAt(i) == c) {
                    count++;
                }
            }
            return count;
        } catch (Exception e) {
            throw new RemoteException("Error in NbOccurrences: " + e.getMessage());
        }
    }
}
