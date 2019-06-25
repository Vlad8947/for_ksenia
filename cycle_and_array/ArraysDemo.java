package ru.vlad.demo;

public class ArraysDemo {

    public static void main(String[] args) {

        int[][] array = new int[][]{ {5,23,423}, {132,41234}, {435,513,53215,5132} };

//        {3, 5, 890}
//        array[0] = 3;

//        { {5, 23, 423}, {132, 41234}, {435,513,53215,5132} }
//        array[0][0]=5; array[1][0]=132;

        for (int i = 0; i < array.length; i++) {

            int[] tempArray = array[i];

            System.out.print("array = [ ");

            for (int j = 0; j < tempArray.length; j++) {

//                System.out.print(array[i][j]);
                System.out.print(tempArray[j]);

                if (j != (tempArray.length - 1)) {
                    System.out.print(", ");
                }
            }

            System.out.print(" ]");
            System.out.println();
        }

    }

    public static void soutArray() {

        int[] array = new int[]{8, 5, 89098, -123};

        int length = array.length;

        System.out.print("array = [ ");

        for (int index = 0; index < array.length; index++) {

            System.out.print(array[index]);

            if (index != (array.length - 1)) {
                System.out.print(", ");
            }
        }

        System.out.print(" ]");

        System.out.println();
    }

    public static void array(){
        int[] array;

        array = new int[]{7, 8, -1};
        int arrayLength = array.length;
        System.out.println(array[0]);

        array = new int[5];
        arrayLength = array.length;
        System.out.println(arrayLength);

        array[0] = 5;
        array[4] = 0;
    }

}
