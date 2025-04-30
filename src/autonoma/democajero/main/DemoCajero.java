/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.democajero.main;

import autonoma.democajero.models.Cajero;
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
       
        Cliente cliente1 = new Cliente (" Cliente 1 ", new int []{2,2,1,5,2,3});
        Cliente cliente2 = new Cliente (" Cliente 2 ", new int []{1,3,5,1,1});
        
        Cajero cajero1 = new Cajero (" Cajero 1 ");
        Cajero cajero2 = new Cajero (" Cajero 2 ");
        
        long initialTime = System.currentTimeMillis();
        
        cajero1.procesarCompra(cliente1, initialTime);
        cajero2.procesarCompra(cliente2, initialTime);
        
    }
    
}
