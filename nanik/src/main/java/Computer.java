/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deha Ortasari
 */
public class Computer extends GamingPlatform{
    
     public Computer(){
        this.isOpen = false;
        this.systemName = "Computer";
    }
    
    @Override
    public void addController(GameController controller){
        if(controller instanceof PlaystationController  || controller instanceof XBoxController){
            System.out.println("Controller connected successfully!");
        } else {
            System.out.println("Invalid controller, please try again!");
        }
        
    }
    
}
