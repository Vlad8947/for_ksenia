package ru.vlad.demo;

public class Main {

    public static void main(String[] args) {

    }

    public static void arrayDemo() {

        int[] array = new int[10];

        array[0] = 10;
        array[1] = 5;
        array[2] = 6;

        System.out.println(array[0]);

    }

    public static void cicleWhile() {

        int num = 1;

        while (num < 10) {
            System.out.println(num);
            num++;
        }

    }

    public static void cicleFor() {

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

    }

    public static void ifif() {
        int a = 5;
        int b = 5;

        if (a == b) {
            System.out.println("true");
        }
        else if (a > b) {
            System.out.println("a > b");
        }
    }

    public static void switcher() {
        int num = -1;

        switch (num) {

            case 1: // если num = 1, то сделать следующий код
                num = num + 1;
                break;

            case 5: // если num = 5, то сделать следующий код
                num = num*num;
                break;

            default: // если num не нашёл равных кейсов
                num = 0;
        }
    }

    public static int calculate(int a, int b, int c, int d){
        int result = a + b + c + d;

        return result;
    }

    public static int types() {
        byte bt = 100;
        short s = 23;

        boolean bool  = true;

        char ch = '$';

        float fl = 45f;

        String str = "hello world!";
        str = new String("asdfkjl");

        System.out.println(str);

        return 5;
    }

}
