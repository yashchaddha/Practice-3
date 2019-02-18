package com.stackrout.programs;

public class AdditionMatrix {
    public static int[][] add(int a[][],int b[][],int rows,int coloums)
    {
        int result[][]=new int[rows][coloums];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloums;j++)
            {
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }
}
