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
public class Stack {
    int length = 5;
    int stack[] = new int[length];
    int top = -1;
    
    public void push(int data){
       if(top >= length-1 ){
           System.out.println("Stack is FUll");
       }else{
        top++;
        stack[top] = data;   
       }        
        
    }
    public int size(){
        return top;
    }
    public int pop(){
        int val= 0;
        if(!isEmpty()){
            val = stack[top];
            stack[top] = 0;
            top--;
        }
        else{
            System.out.println("Stack is empty");
        }       
        return val;
    }
    
    public int peek(){
        int val = 0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            val = stack[top-1];
        }
        return val;
    }
    
    public boolean isEmpty(){
       return top<0;
    }
      
    
    public void show(){
        for(int i = 0;i<stack.length;i++){
            System.out.println(stack[i]);
        }
    }
}
