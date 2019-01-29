/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomStack;

/**
 *
 * @author abina
 */
public class Runner {
   
    public static void main(String args[]){
        Stack stack = new Stack();
        System.out.println("Is Empty"+stack.isEmpty());
 

        
        System.out.println("is EMpty"+stack.isEmpty());
        stack.pop();
        stack.pop();
        
        stack.show();
    }
}
