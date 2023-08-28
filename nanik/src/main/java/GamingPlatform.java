/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deha Ortasari
 */
public abstract class GamingPlatform {
    
   protected boolean isOpen;
   protected String systemName;
   
   
   public void open(){
       if(this.isOpen){
           throw new IllegalStateException(systemName + " is already open.");
       } else{
           this.isOpen = true;
           System.out.println("System booting...");
       }
   }
   
   public void shutdown(){
       if(!this.isOpen){
           throw new IllegalStateException(systemName + " is already closed.");
       } else {
           System.out.println("System shutting down...");
           this.isOpen = false;
       }
   }
   
   public void addController(GameController controller){
       
   }
   
   public void playGame(){
       if(!this.isOpen){
           throw new IllegalStateException(systemName + " is already closed.");
       }
       System.out.println("Game loading...");
   }
    
}
