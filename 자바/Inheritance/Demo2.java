interface Backend { // 백엔드 인스턴스 생성

  public void connectServer(); // 반환값 없는 메소드 생성
}

class Frontend {
  public int ram = 16;
  private int ram1 = 8;


  public void responsive(String str) { // Frontend 클래스의 메소드
    System.out.println(str + " can also be used as frontend.");
  }
}

class Language extends Frontend implements Backend { // 상속을 Frontend 인스턴스연동은 Backend로 해주었다.

  String language = "Java"; // Language 변수를 만들어 String 형으로 만들었으니 문자열을 입력해 주었다.

  public void connectServer() {
    System.out.println(language + " can be used as backend language."); // 인스턴스에 있는 메소드를 활용해 출력을 하고있다.
  }
}

public class Demo2 {
  public static void main(String[] args) {

    Language java = new Language(); // Language클래스를 인스턴스화 해서 java 객체를 만들어주었다.
    java.connectServer();
    java.responsive(java.language);
    System.out.println(java.ram1);
  }

}
