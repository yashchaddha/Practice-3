package com.stackrout.programs;

public class removeVowels {
    public static String[] remove(String places[])
    {
        String dummy="";

        for(int i=0;i<places.length;i++)
        {
            String copy=places[i];
            for(int j=0;j<copy.length();j++)
            {
                if(     copy.charAt(j)=='a'||
                        copy.charAt(j)=='e'||
                        copy.charAt(j)=='i'||
                        copy.charAt(j)=='o'||
                        copy.charAt(j)=='u')
                {
                    continue;
                }
                else
                {
                    dummy=dummy+copy.charAt(j);
                }

            }
            places[i]=dummy;
            dummy="";
        }
        return places;
    }
}
