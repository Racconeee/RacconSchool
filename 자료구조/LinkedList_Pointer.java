
class ListNode {
    String name;
    ListNode link;

    public ListNode() {

    }

    public ListNode(String name1, ListNode link1) {
        name = name1;
        link = link1;
    }
}

public class FirstList {
    public static void main(String[] args) {

        ListNode list1; // 참조변수. ListNode에서 찍어낸 빵의 주소를 저장
        list1 = new ListNode();
        list1.name = "Choi";
        list1.link = null;
        System.out.printf("\n첫번째 이름 : " + list1.name + "  link : "); // 첫번째 리스트의 값
        System.out.println(list1.link);

        list1.link = new ListNode(); // 두번째 값을 앞에 link와 연결
        list1.link.name = "Kim"; // 두번째 값에 이름 넣기
        list1.link.link = null; // 두번째 값에 link부분 null로 초기화
        System.out.println("두번째 이름 : " + list1.link.name + " link :  " + list1.link.link); // 두번째 리스트의 값
        list1.link.link = new ListNode("Lee", null);
        System.out.println("3번째 이름 : " + list1.link.link.name + " link :  " + list1.link.link.link); // 세번째 리스트의 값

        list1.link.link.link = new ListNode("Park", null);
        System.out.println("4번째 이름 : " + list1.link.link.link.name + " link :  " + list1.link.link.link.link);

        list1.link.link.link.link = new ListNode("Yoo", null);
        System.out.println("5번째 이름 : " + list1.link.link.link.link.name + " link :  " + list1.link.link.link.link.link);

        // link로 연속해서 찍는건 비 효율적
    }
}
