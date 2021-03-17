package java8;

import java.util.Arrays;
import java.util.List;

public class LongestNumber {

    public static void main(String[] args) {

        List<String> list  = Arrays.asList("work","is","worship");

        int longest = 0;
        String str1 = "";

        for (String str:list) {

            if(str.length()>longest){
                longest = str.length();

                str1 = str;
            }
        }

        System.out.println(str1);
    }
}
