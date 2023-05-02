
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author 10722128072
 */
public interface Calculadora extends Remote {
    
    public int adicao (int a, int b)throws RemoteException;
    
    public int subtracao (int a, int b) throws RemoteException;
    
    public int multiplicacao (int a, int b) throws RemoteException;
    
    public double divisao (int a, int b)throws RemoteException;
    
}
