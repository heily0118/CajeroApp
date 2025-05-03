/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.democajero.models;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250430
 * @version 1.0.0
 */
public class CajeroConcurrente extends Thread{
    private String nombre;
    private Cliente cliente;
    private long timeStamp;

    public CajeroConcurrente(String nombre, Cliente cliente, long timeStamp) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.timeStamp= timeStamp;
    }

   
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    
   @Override
    public void run(){
        
       System.out.println("El cajero " + this.nombre 
        + " \nComienza a procesar la compra del cliente: " + this.cliente.getNombre()
        + "\nEn el tiempo:" + (System.currentTimeMillis() - this.timeStamp)/1000 
                + " Seg.");
        
        for (int i= 0; i<this.cliente.getCarroCompra().length; i++){
         
           
            this.esperarXsegundos(this.cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1)
            + " ---> Tiempo: " + (System.currentTimeMillis()- this.timeStamp)/1000
            + " seg ");
        
            
           System.out.println("El cajero " + this.nombre + "Ha terminado de procesar" 
                + this.cliente.getNombre()+ "\nEn el tiempo: "+
        (System.currentTimeMillis() - this.timeStamp) /1000 + " seg");
           
    
        }
    }
           
    public void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos * 1000);
            
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        
    }
    
    
}
