package com.kunal;

public class Overloading {
    public static void main(String[] args) {
       fun(67);
       fun("Kunal Kushwaha");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

    // overloading : 2 or more fns with same name and return type can exist if have diff parameters(diff types of args or diff num of args)


    // not possible cases--

    // static int fun(int a){
    //     return 0;
    // }
    // static void fun(int a){
    // }
}
