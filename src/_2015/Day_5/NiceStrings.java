package _2015.Day_5;

import java.io.*;

public class NiceStrings {

    public static boolean haveDoubleLetters(String line){
        char [] symbols = line.toCharArray();
        for (int i=0;i<line.length()-1;i++){
            if (symbols[i]==symbols[i+1])return true;
        }
        return false;
    }
    public static boolean notContain(String line){
        if (line.contains("ab")||line.contains("cd")||line.contains("pq")||line.contains("xy"))return false;
       return true;
    }
    public static boolean threeVowels(String line){
        int count = 0;
        char[]symbols = line.toCharArray();
        for (int i=0;i<symbols.length;i++){
            if (symbols[i]=='a'||symbols[i]=='e'||symbols[i]=='i'||symbols[i]=='o'||symbols[i]=='u')
                count++;
            if (count==3)return true;
        }
        return false;
    }
    //PART II
    public static boolean getTwiceLetters(String line){
        char[]symbols=line.toCharArray();
        for (int i=0;i<line.length()-3;i++){
            for (int j=i+2;j<line.length()-1;j++){
                if (symbols[j]==symbols[i]&&symbols[j+1]==symbols[i+1])
                    return true;
            }
        }
        return false;
    }
    public static boolean doubleLeters(String line){
        char[]symbols = line.toCharArray();
        for (int i=0;i<symbols.length-2;i++){
            if (symbols[i]==symbols[i+2])return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        File file = new File("src/_2015/Day_5/input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String row;
        int niceString = 0;
        int niceString2 = 0;
        while ((row=reader.readLine())!=null){
            if (haveDoubleLetters(row)&&threeVowels(row)&&notContain(row))
                niceString++;
            if (getTwiceLetters(row)&&doubleLeters(row))
                niceString2++;
        }
        System.out.println("Nice strings, part_1: "+ niceString);
        System.out.println("Nice strings, part_2: "+ niceString2);
    }
}
