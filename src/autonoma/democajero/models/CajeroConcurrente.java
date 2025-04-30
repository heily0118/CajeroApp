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
    private int cantidad;

    public CajeroConcurrente(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.cantidad = 4;
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

   @Override
    public void run(){
        for (int i= 0; i<10; i++){
            System.out.println("Hilo por herencia: " + i);
            
            
            try{
                Thread.sleep(1000);
                
            }catch(InterruptedException e){
                System.out.println("Hilo por herencia interrumpido");
                
            }
        }
    
    }
    
}
