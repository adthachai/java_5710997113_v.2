/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author BANK
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
   
   public void visit(Computer computer) {
      System.out.println("Displaying Computer.");
   }

   
   public void visit(Mouse mouse) {
      System.out.println("Displaying Mouse.");
   }

  
   public void visit(Keyboard keyboard) {
      System.out.println("Displaying Keyboard.");
   }

   
   public void visit(Monitor monitor) {
      System.out.println("Displaying Monitor.");
   }
    
}
