package com.basics.transientExample;

import java.io.*;

// To achieve serialization we use interface called Serializable
public class User implements Serializable {
    String username = "Kavya";
    transient String password = "159753";
}
class TransientDemo{
    public static void main(String[] args) throws Exception {// when the exception is unknown, just use "Exception"
        User user = new User();
        ObjectOutputStream oos =
                new ObjectOutputStream
                        (new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();
        ObjectInputStream ois =
                new ObjectInputStream
                        (new FileInputStream("user.ser"));
        User user1 = (User) ois.readObject();
        oos.close();
        System.out.println(user1.username);
        System.out.println(user1.password);
    }
}