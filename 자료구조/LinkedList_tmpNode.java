
class ListNode {
    String name;
    ListNode link;

    public ListNode(String name1, ListNode link1) {
        name = name1;
        link = link1;
    }
}

public class LinkedList_tmpNode {
    public static void main(String[] args) {
        // link.link.link...을 보완한 프로그램

        ListNode tmpNode;
        ListNode list2;
        ListNode last;

        tmpNode = new ListNode("Choi", null); // 첫번째 원소생성
        list2 = tmpNode;
        last = tmpNode;
        tmpNode = new ListNode("kim", null);
        last.link = tmpNode;
        last = tmpNode;
        tmpNode = new ListNode("LEE", null);
        last.link = tmpNode;
        last = tmpNode;
        tmpNode = new ListNode("Park", null);
        last.link = tmpNode;
        last = tmpNode;
        tmpNode = new ListNode("Yoo", null);
        last.link = tmpNode;
        last = tmpNode;

        tmpNode = list2;
        System.out.println("1st node " + tmpNode.name);
        tmpNode = tmpNode.link;
        System.out.println("2st node " + tmpNode.name);
        tmpNode = tmpNode.link;
        System.out.println("3st node " + tmpNode.name);
        tmpNode = tmpNode.link;
        System.out.println("4st node " + tmpNode.name);
        tmpNode = tmpNode.link;
        System.out.println("5st node " + tmpNode.name);
        System.out.println("마지막의 node의 link값은 : " + tmpNode.link);
    }
}
