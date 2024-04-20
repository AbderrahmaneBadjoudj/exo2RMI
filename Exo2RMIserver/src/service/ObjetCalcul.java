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
class ObjetCalcul extends UnicastRemoteObject implements IObjetCalcul {
    public ObjetCalcul() throws RemoteException {
    }

    public int add(int a, int b) throws RemoteException {
        try {
            return a + b;
        } catch (Exception e) {
            throw new RemoteException("Error in add: " + e.getMessage());
        }
    }
}
