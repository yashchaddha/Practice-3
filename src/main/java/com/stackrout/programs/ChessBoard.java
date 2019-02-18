package com.stackrout.programs;

public class ChessBoard {
    public static String[][] createPattern(int row,int column)
    {
        String[][] chess=new String[row][column];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i%2==0)
                {
                    chess[i][j]="WW|BB|";
                }
                else
                {
                    chess[i][j]="BB|WW|";
                }
            }
        }
        return chess;
    }
}
