/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deha Ortasari
 */
public interface GameController {
    
    //bu implementation icin sanki abstract class kullanmak daha iyi olurdu(?)
    
    public void buttonNorth();
    public void buttonEast();
    public void buttonSouth();
    public void buttonWest();
    
    public void movementUp();
    public void movementDown();
    public void movementLeft();
    public void movementRight();
    
    public void mainButton();
}
