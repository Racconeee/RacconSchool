
class Node {
    String data;
    Node link;

    public Node(String name) {
        data = name;
        link = null;
    }
}

public class linkedList_link_link {
    public static void main(String[] args) {

        // 첫번째 원소를 생성

        Node list1;

        list1 = new Node("Choi");
        list1.link = new Node("Kim");
        list1.link.link = new Node("Park");
        list1.link.link.link = new Node("Yoo");

        System.out.println(" " + list1.data + " " + list1.link);
        System.out.println(" " + list1.link.data + " " + list1.link.link);
        System.out.println(" " + list1.link.link.data + " " + list1.link.link.link);
        System.out.println(" " + list1.link.link.link.data + " " + list1.link.link.link.link);

        Node p;

        p = list1;

        while (p != null) {
            System.out.print(" " + p.data);
            p = p.link;
        }
        System.out.println("");

    }
}
