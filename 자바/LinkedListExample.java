import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        System.out.println("Element at index 1: " + linkedList.get(1));

        linkedList.set(2, "Mango");

        String fruit = "Apple";
        if (linkedList.contains(fruit)) {
            System.out.println(fruit + " is present in the LinkedList.");
        } else {
            System.out.println(fruit + " is not present in the LinkedList.");
        }

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("Banana");

        System.out.println("LinkedList elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("LinkedList size: " + linkedList.size());

        linkedList.clear();
        System.out.println("LinkedList size after clearing: " + linkedList.size());
    }
}
