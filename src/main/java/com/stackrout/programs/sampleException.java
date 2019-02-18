package com.stackrout.programs;

public class sampleException {
    public static void main(String[] args) {

        try{
            int data = 50/0;
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is in Finally Block");
        }

    }
}
