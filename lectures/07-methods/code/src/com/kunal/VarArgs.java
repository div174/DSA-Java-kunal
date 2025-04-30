package com.kunal;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        fun(2,3,5,66,4,3,2,2);
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        // demo();//error--unable to decide which of 2 demo fn to use
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }
    // var length args must be in the last
    // static void wrong(int a, int b, String ...v,int c) {

    // }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
