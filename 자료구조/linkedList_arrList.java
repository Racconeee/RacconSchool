
public class linkedList_arrList {

    class ListNode {
        String name;
        ListNode link;

        public ListNode(String name1, ListNode link1) {
            name = name1;
            link = link1;
        }
    }

    public class linkedList_arrList {
        public static void main(String[] args) {

            String[] arrList1 = { "Choi", "Kim", "Lee", "Park", "Yoo" }; // arrList1의 배열 선언
            System.out.println("arrList1 4st node : " + arrList1[3]); // arrList1의 4번째 원소값 출력

            // 아래코드는 linkList1의 배열생성과 4번째 원소 출력
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

            tmpNode = list2; // linkList 1st node
            tmpNode = tmpNode.link; // linkList 2st node
            tmpNode = tmpNode.link; // linkList 3st node
            tmpNode = tmpNode.link; // linkList 4st node
            System.out.println("linkList1  4st node : " + tmpNode.name); // 마지막까지 4번을 걸쳐야 출력이 가능하다

        }
    }

}
