package com.stackrout.programs;

public class ConsecutiveNumbers {
    boolean result = false;
    public static boolean checkconsecutive(String values){
        String[] array= values.split(",");
        boolean result=true;
        for(int i=0;i<array.length-1;i++){
            int difference=Integer.parseInt(array[i+1])-Integer.parseInt(array[i]);
            System.out.println(difference);
            if(difference==1 || difference==-1){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        return result;
    }
}