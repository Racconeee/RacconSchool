class Animal1{
    int leg;
    int arms;
    String name;
    public Animal1(){
        System.out.println("기본");
        System.out.println();
    }
    public Animal1(int leg){
        System.out.println("leg  "+leg);
        System.out.println();
    }
    public Animal1(String name,String name1){
        System.out.println("name  "+name+" ,arms  "  +name1);
        System.out.println();
    }
    public Animal1(int arms, String name){
        System.out.println("leg  "+leg+" ,name  " +name);
        System.out.println();
    }
}

public class aaaa {
    public static void main(String[] args) {
        Animal1 cow = new Animal1(1, "마리");
        Animal1 cow1 = new Animal1(50);
        Animal1 cow2 = new Animal1();
        Animal1 cow3 = new Animal1( "마리","마리");
        System.out.println(cow);
    }
}