/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.democajero.main;

import autonoma.democajero.models.Cajero;
import autonoma.democajero.models.CajeroConcurrente;
import autonoma.democajero.models.Cliente;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250430
 * @version 1.0.0
 */
public class DemoCajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cliente cliente1 = new Cliente (" Sara ", new int []{2,2,1,5,2,3});
        Cliente cliente2 = new Cliente (" Vanessa ", new int []{1,3,5,1,1});
        Cliente cliente3 = new Cliente (" Pedro ", new int []{1,3,5,1,1});
        
        Cajero cajero1 = new Cajero (" Cajero 1 ");
        Cajero cajero2 = new Cajero (" Cajero 2 ");
        
        long initialTime = System.currentTimeMillis();
        
        cajero1.procesarCompra(cliente1, initialTime);
        cajero2.procesarCompra(cliente2, initialTime);
        
        Thread cajeroCon1 = new Thread(new CajeroConcurrente("Cajero 1", cliente1, initialTime));
        Thread cajeroCon2 = new Thread(new CajeroConcurrente("Cajero 2", cliente2, initialTime));
        Thread cajeroCon3 = new Thread(new CajeroConcurrente("Cajero 3", cliente3, initialTime));

    
        cajeroCon1.start();
        cajeroCon2.start();
        cajeroCon3.start();
        
         System.out.println("\n Los cajeros estan procesando las compras de los clientes.\n");
        
    }
    
}
