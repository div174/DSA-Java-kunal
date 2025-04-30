package com.kunal;

public class PassingExample {
    public static void main(String[] args) {
        String chacha = "Iron Man";
        greet(chacha);
    }
    //pass by val only, copies the val of the reference

    static void greet(String naam) {
        System.out.println(naam);
    }
}
