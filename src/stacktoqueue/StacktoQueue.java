/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktoqueue;

import java.util.Stack;

/**
 *
 * @author mahith
 */
public class StacktoQueue<E> {

    /**
     * @param args the command line arguments
     */
    
     Stack<E> st=new Stack();
     Stack<E> st1=new Stack();
    
    public void add(E value){
    
       st.push(value);
       System.out.println();
    }
    
    public void showStack(){
    
        System.out.print( st1 );
    
    }
    
    public void remove(){
        
    // Trasnfer the elements form st to st1 and pop the top most element    
   
        while(st1.isEmpty()){
            int x=st.lastIndexOf(st.peek());
            for(int i=0;i<=x;i++){
          
              st1.push(st.pop());
            } 
            System.out.println(st1.pop());
        } 
        
    // Transfer back the elements from st1 to st    
        while(st.isEmpty()){
        
            int y=st1.lastIndexOf(st1.peek());
            for(int i=0;i<=y;i++){
          
              st.push(st1.pop());
            }
        System.out.println(st);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        StacktoQueue s=new StacktoQueue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.remove(); 
        s.add(4);
        s.remove();
    }
    
}
