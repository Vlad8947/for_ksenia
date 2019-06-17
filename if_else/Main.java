package ru.vlad.without_maven;

public class Main {

    public static void ifWithBool() {

        boolean b = true;

        if (b) {
            System.out.println("b == true");
        } else {
            System.out.println("b == false");
        }

    }

    public static void ifWithNum() {

        int num1 = 10;
        int num2 = 5;

        // < , <= , > , >= , == , != , !(boolean)
        if (num1 > num2) {
            System.out.println("num1 больше чем num2");
        } else {
            System.out.println("num1 не больше num2");
        }

    }

    public static void ifWithString() {

        // При создании текста, как в первом способе, в переменную поместиться ссылка, которая будет указывать
        //      на первый текст "str1". Поэтому, при их дальнейшем их сравнении оператором "==", выдаст true
        //      (потому что ссылка одна и та же). Из этого следует, что так сравнивать текст не получится.
        // Для наглядного примера того, что оператором "==" сравниваются ссылки, я насильно поместил текст в ссылочную
        //      переменную ( new String("google") ) и сравнил.

        String str1 = "google";
        // Strung str2 = "google";
        String str2 = new String("google");

        // Выдаст false, потому что сравниваются не текст в строке, а ссылки на эти строки.
        if (str1 == str2) {
            System.out.println("ссылка str1 равна str2");
        } else {
            System.out.println("ссылка str1 не равна str2");
        }

        // Вот так надо сравнивать строки: название_переменной.equals(строка) .
        boolean result = str1.equals(str2);
        if (result) {
            System.out.println("строка в str1 равна str2");
        } else {
            System.out.println("строка в str1 не равна str2");
        }
    }

}
