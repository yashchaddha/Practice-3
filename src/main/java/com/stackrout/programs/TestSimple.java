package com.stackrout.programs;

public class TestSimple {
    public static void main(String args[]) {
        int result = 0;
        int arraySize = 3;
        int badSize = -1;
        int[] array = null;

        for(int choice = 0; choice<3 ; ++choice)
            try {
                switch(choice) {
                    case 0:
                        result = array[0];
                        break;
                    case 1:
                        array = new int[badSize];
                        break;
                    case 2:
                        array = new int[arraySize];
                        result = array[arraySize];
                        break;
                }
            } catch(NullPointerException e) {
                System.out.println("\nNullPointerException Exception caught. " +
                        "Message in NullPointerException is:\n" +
                        "\n" + e + "\n");
                System.out.println("The contents of the stack trace are:\n");
                e.printStackTrace();
            } catch(NegativeArraySizeException e) {
                System.out.println("\nNegativeArraySizeException Exception caught. " +
                        "Message in NegativeArraySizeException is:\n" +
                        "\n" + e + "\n");
                System.out.println("The contents of the stack trace are:\n");
                e.printStackTrace();
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArrayIndexOutOfBoundsException Exception caught. " +
                        "Message in ArrayIndexOutOfBoundsException is:\n" +
                        "\n" + e + "\n");
                System.out.println("The contents of the stack trace are:\n");
                e.printStackTrace();
            }
    }
}
