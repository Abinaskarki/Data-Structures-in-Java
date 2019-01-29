/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomLinkedList;

/**
 *
 * @author abina
 */
public class Runner {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(10000);
        list.insertAtStart(8);
        list.insertAt(2,35);
        list.delete(3);
        list.show();
    }
}
