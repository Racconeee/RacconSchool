package Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex {
    public static void main(String[] args) {
        int time = 10;
        Queue<Integer> q1 = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--) {
            q1.add(i);
        }
        

        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.peek());
        System.out.println(q1.peek());
        System.out.println(q1.peek());
        q1.add(100);

        // while(!q1.isEmpty()){
        //     System.out.println(q1.remove());
        //     // Thread.sleep(100);
        // }
        Iterator e = q1.iterator() ;
        Object a;
        while(e.hasNext()){
            a = e.next();
            System.out.println(a);
        }
    }
}
