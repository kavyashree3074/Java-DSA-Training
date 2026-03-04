package tripillarsCodingAssignment.module3;
//Demonstrate encapsulation using private variables and getter/setter methods
public class GetSet {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Invalid age!");
            }
        }

        public static void main(String[] args) {
            GetSet s1 = new GetSet();

            s1.setName("Kavya");   // Capital N
            s1.setAge(20);

            System.out.println("Name: " + s1.getName());  // Capital N
            System.out.println("Age: " + s1.getAge());
        }
    }