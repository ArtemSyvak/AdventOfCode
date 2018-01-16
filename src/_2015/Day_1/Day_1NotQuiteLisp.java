package _2015.Day_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Day_1NotQuiteLisp {

    public static void main(String[] args) throws Exception {
        File f = new File("src/_2015/Day_1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String input = br.readLine();
        char[] charsInput = input.toCharArray();
        int count = 1;
        for (int i = 0;i<charsInput.length;i++){
            if (charsInput[i]=='(')count++;
            else count--;
            if (count==-1) {
                System.out.println(i);
                break;
            }
        }
    }
}
