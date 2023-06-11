import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedList_Ex1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("LEE");
        list.add("kim");
        list.add("jo");
        list.add("Jae");
        list.add("tae");
        list.add("wae");

        System.out.println("list의 원소의 개수는 : "+list.size());
        System.out.println("list의 원소의 개수는 : "+list.set(2,"bread"));

        System.out.println("list의 첫번쨰 값 : " + list.getFirst());
        System.out.println("list의 마지막 값 : " + list.getLast());

        System.out.println("list안에 모든 원소 출력 :" );
        while(list.size() > 0){
            System.out.println(list.remove());
        }
    }
}
