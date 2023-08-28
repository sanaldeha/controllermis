/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deha Ortasari
 */
public class Playstation extends GamingPlatform{
    
    public Playstation(){
        this.isOpen = false;
        this.systemName = "Playstation";
    }
    
    @Override
    public void addController(GameController controller){
        if(controller instanceof PlaystationController){
            System.out.println("Controller connected successfully!");
        } else {
            System.out.println("Only Playstation Controllers can be connected to Playstation consoles!");
        }
        
    }
}
