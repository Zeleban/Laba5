package com.brainacad;

import java.util.Arrays;

public class Pract5 {public static void main(String[] args) {

    // PART 1
    // 1.1)
    float[] firstArray = new   float[4] ; // TODO init it's array by new with size 4.

    // TODO insert some value to start of array and to end of array.

    int[] intArray= {1,2,3,4,5,6,7}; // TODO init and fill it's array with any values. Use {} syntax.

    // 1.2):
    int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length); // TODO copy "intArray". Use copyOf...

    // 1.3)
    // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);
    // 1.4)
    // TODO print "intArrayCopy", use Arrays toString.
    Arrays.toString(intArrayCopy);
    // 1.5)
    // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        if (Arrays.equals(intArray,intArrayCopy)) {
            System.out.println("Arrays equals.");
        }
        else {
            System.out.println("Arrays not equals.");
        }


    // PART 2
    int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

    // Print array values in cycle.
    for (int value: testArray) {
        System.out.print(value + " ");
    }

    // 2.1)
    // TODO calc sum of all array elements and print result.
    int [] arr= {1,5,6,10};
    int summ= 0;
    for (int value: arr){
        summ += value;
        System.out.println(summ);

    }
    // 2.2)
    // TODO calc sum of all numbers with odd indexes and print result.
    arr= new int[]{1,5,6,10};
    summ= 0;


    for (int j = 0; j < arr.length; j++) {
        if (j%2 != 0) {
            summ+= arr[j];
            System.out.println(summ);

        }

    }

        System.out.println(summ);
    // 2.3)
    // TODO find max value in array.


    // PART 3

    //3.1
    // TODO create two-dimensional array with size [3][4]

    //3.2
    // TODO fill array with any numbers in cycles.

    //3.3
    // TODO calc sum of all array elements and print result.


    // PART 4*

    long[][] matrix = new long[9][9];

    int ratio = 0;
    for (long[] row: matrix ) {
        Arrays.fill(row, ++ratio);
    }

    int sum = 0;
    // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
    System.out.println(sum);
}
}

