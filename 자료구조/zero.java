
class Node {
    String data;
    Node link;

    public Node(String name) {
        data = name;
        link = null;
    }
}

public class zero {
    public static void main(String[] args) {
        System.out.println("gg");

        // 첫번째 원소를 생성

        Node list1;
        list1 = new Node("Choi");
        System.out.println("list의 1번째 원소는 :  " + list1.data + " " + list1.link);
        list1.link = new Node("Kim");
        System.out.println("list의 2번째 원소는 :  " + list1.link.data + " " + list1.link.link);
        list1.link.link = new Node("LEE");
        System.out.println("list의 3번째 원소는 :  " + list1.link.link.data + " " + list1.link.link.link);
        list1.link.link.link = new Node("Park");
        System.out.println("list의 4번째 원소는 :  " + list1.link.link.link.data + " " + list1.link.link.link.link);
        list1.link.link.link.link = new Node("Yoo");
        System.out.println("list의 5번째 원소는 :  " + list1.link.link.link.link.data + " " + list1.link.link.link.link.link);

    }
}
