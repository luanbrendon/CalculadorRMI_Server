
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 10722128072
 */
public class ServerRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
              String nomeServico = "Calculadora";
                CalculadoraIMP calculadora = new CalculadoraIMP();
                CalculadoraIMP stub = (CalculadoraIMP) UnicastRemoteObject.exportObject(calculadora, 0);
                Registry registro = LocateRegistry.getRegistry();
                registro.bind(nomeServico,calculadora);
                System.out.println("Servidor no ar. Nome do objeto no seervidor: \'" + nomeServico + "\'");
        }catch (Exception e) {
            System.out.println("Exceção: " +e.getMessage());
            e.printStackTrace();
        }
    }
    
}
