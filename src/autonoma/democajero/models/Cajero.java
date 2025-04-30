/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.democajero.models;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250430
 * @version 1.0.0
 */
public class Cajero {
    private String nombre;

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra (Cliente cliente, long timeStamp){
        System.out.println("El cajero " + this.nombre 
        + " \nComienza a procesar la compra del cliente: " + cliente.getNombre()
        + "\nEn el tiempo:" + (System.currentTimeMillis() - timeStamp)/1000 
                + " Seg.");
        
        for (int i=0; i< cliente.getCarroCompra().length; i++){
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1)
            + " ---> Tiempo: " + (System.currentTimeMillis()- timeStamp)/1000
            + " seg ");
        }
        
        System.out.println("El cajero " + this.nombre + "Ha terminado de procesar" 
                + cliente.getNombre()+ "\nEn el tiempo: "+
        (System.currentTimeMillis() - timeStamp) /1000 + " seg");
        
    }
    
    public void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos * 1000);
            
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        
    }
    
}
