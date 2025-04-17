
import java.util.*;

public class queue {
    public static void main(String[] args) {
        // we add element in quueue from rear and remove from front
     // queue is a interface which is implememnted by many classes like linkedlist, arraydeque, priorityqueue etc

bvbbb
        Queue<Integer>qq=new LinkedList<>();
         

        // add element in queue 
        //qq.add(1);
        

        qq.offer(12);
        qq.offer(13);
        System.out.println(qq);



        // remove element from queue jo pehle dala hoga wo pehle niklega
          qq.poll();
            System.out.println(qq);
            //return a element after remove in queue
           

           // peek() is used to get the head of the queue without removing it
           // agla element kya hoga wo dekhne ke liye
           
           qq.peek();
    }


}
