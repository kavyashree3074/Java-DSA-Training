package assignment2.module4;
class Student{

    String name;
    int USN;
    static  String college = "SNPSU";
    Student( String name,int USN){
        this.name=name;
        this.USN=USN;
    }
    void studentDetails(){
        System.out.println("Name: " + name + "USN: " + USN + " College: " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kavya ", 51);
        s1.studentDetails();
    }
}
