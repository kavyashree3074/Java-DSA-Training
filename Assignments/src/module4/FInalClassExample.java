package module4;
final class Demo {
    void show(){
        System.out.println("Final class cannot be inherited ");
    }
}
class FinalClassExample{
    public static void main(String[] args) {
        Demo d=new Demo();
        d.show();
    }
}

