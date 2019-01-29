/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueImplementation;

/**
 *
 * @author abina
 */
public class Queue {
    int length = 5;
    int queue[] = new int[length];
    int top  = -1;
    int size = -1;
    
    public void enQueue(int data){
        if(queueSize()>length-1){
            System.out.println("QUeue is full");
        }else{
            top++;
        size++;
        queue[top] = data;
        }
                
            
        
    }
    public boolean isEmpty(){
        return size<0;
    }
    
    public int queueSize(){
        return size+1;
    }
    public int deQueue(){
        int val = 0;
        if(!isEmpty()){
        val = queue[top-size];
        queue[top-size] = 0;
        size--;
        }else{
            System.out.println("Empty Queue");
        }
        
        return val;
    }
    
    public void show(){
        for(int i = 0;i<length;i++){
            System.out.println(queue[i]);
        }
    }
    
}
