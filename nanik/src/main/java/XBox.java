/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deha Ortasari
 */
public class XBox extends GamingPlatform{
    
    public XBox(){
        this.isOpen = false;
        this.systemName = "XBox";
    }
    
    @Override
    public void addController(GameController controller){
        if(controller instanceof XBoxController){
            System.out.println("Controller connected successfully!");
        } else {
            System.out.println("Only XBox Controllers can be connected to XBox consoles!");
        }
        
    }
    
}
