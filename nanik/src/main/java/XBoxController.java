/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deha Ortasari
 */
public class XBoxController implements GameController{
    
    public void buttonNorth(){
        System.out.println("Shoot");
    }
    
    public void buttonEast(){
        System.out.println("Pass");
    }
    
    public void buttonSouth(){
        System.out.println("Breaking pass");
    }
    
    public void buttonWest(){
        System.out.println("Cross ball");
    }
    
    public void movementUp(){
        System.out.println("Moving up");
    }
    public void movementDown(){
        System.out.println("Moving down");
    }
    
    public void movementLeft(){
        System.out.println("Moving left");
    }
    public void movementRight(){
        System.out.println("Moving right");
    }
    
    public void mainButton(){
        System.out.println("Pause");
    }
    
}
