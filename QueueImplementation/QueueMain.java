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
public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.enQueue(5);
        queue.enQueue(2);
        queue.enQueue(5);
        queue.enQueue(2); queue.enQueue(5);
        queue.enQueue(2); queue.enQueue(5);
        queue.enQueue(2);
       /* queue.show();
        System.out.println(queue.queueSize());
        System.out.println(queue.deQueue());
        System.out.println(queue.queueSize());
        System.out.println(queue.isEmpty());
        System.out.println(queue.deQueue());
        System.out.println(queue.queueSize());
        System.out.println(queue.isEmpty());
        queue.show();
        */
    }
}
