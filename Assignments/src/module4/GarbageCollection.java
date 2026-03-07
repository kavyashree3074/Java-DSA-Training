package module4;

public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();
        obj = null;
        System.gc();

        System.out.println("Garbage Collection performed ");

    }

}

