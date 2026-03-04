package tripillarsCodingAssignment.module3;
//Create a class Student with attributes name and marks and display the details.
public class Student {
    int marks;
    String name;
    void nameMArks(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Kavya";
        s1.marks=99;
        Student s2 = new Student();
        s2.name="Pari";
        s2.marks=98;
        s1.nameMArks();
        System.out.println();
        s2.nameMArks();
    }
}
