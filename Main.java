package com.leet_code;

public class Main {
    public static void main(String[] args) {
        Rotate_List a=new Rotate_List();
        a.insertfirst(5);
        a.insertfirst(4);
        a.insertfirst(3);
        a.insertfirst(2);
        a.insertfirst(1);

        a.rotateRight(a.head,1);

        a.display();
    }
}
