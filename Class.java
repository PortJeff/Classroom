import java.util.HashMap;
import java.util.Iterator;

public class Class {

    private static String className = "AP Computer Science";

    private static int classWidth = 5;
    private static int classHeight = 1;

    public static Student[][] Classroom = new Student[classWidth][classHeight];

    public static void main(String[] args) {

        HashMap<String, Integer> Students = new HashMap<String, Integer>();

        Students.put("Nicholas", 15);
        Students.put("Joshua", 16);
        Students.put("Roger", 15);
        Students.put("Daniel", 16);
        Students.put("Sandy", 16);


        System.out.println("----------- " + className + " -----------");
        System.out.print(" ");
        for (int j = 1; j < classWidth + 1; j++) {
            System.out.print(" ".repeat(5) + "[" + j + "]");
        }
        System.out.println("");

        Iterator<String> allStudents = Students.keySet().iterator();
        for (int i = 0; i < classHeight; i++) {
            System.out.print("[" + ((int)i + 1) + "] ");
            for (int j = 0; j < classWidth; j++) {
                String thisStudent = "";

                try {
                    thisStudent = allStudents.next();
                    Student temp = new Student(thisStudent, Students.get(thisStudent));
                    Classroom[j][i] = temp;
                    System.out.print(temp.getName().substring(0, 5) + 
                        temp.getAge() + " ");
                } catch(Exception e) {
                    thisStudent = "Undefine";
                }
            }
            System.out.println("\n");
        }
    }

}
