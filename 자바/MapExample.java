
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("John", 85);
        studentGrades.put("Emily", 92);
        studentGrades.put("Michael", 78);
        studentGrades.put("Sophia", 95);
        studentGrades.put("Daniel", 88);

        System.out.println("John's grade: " + studentGrades.get("John"));
        System.out.println("Sophia's grade: " + studentGrades.get("Sophia"));

        studentGrades.put("Emily", 96);
        System.out.println("Updated grade for Emily: " + studentGrades.get("Emily"));

        String name = "Michael";
        if (studentGrades.containsKey(name)) {
            System.out.println(name + " is in the map.");
        } else {
            System.out.println(name + " is not in the map.");
        }

        studentGrades.remove("Daniel");
        System.out.println("Daniel's grade after removal: " + studentGrades.get("Daniel"));

        System.out.println("Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();
            System.out.println(studentName + ": " + grade);
        }

        studentGrades.clear();
        System.out.println("Map size after clearing: " + studentGrades.size());
    }
}
