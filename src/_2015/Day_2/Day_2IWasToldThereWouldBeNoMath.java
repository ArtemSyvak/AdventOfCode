package _2015.Day_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Day_2IWasToldThereWouldBeNoMath {

    public int min(int a,int b,int c){
        if (a>b){
            return a>c?(b+c)*2:(a+b)*2;
        }else return b<c?(a+b)*2:(a+c)*2;
    }
    public static void main(String[] args) throws Exception {
        File f = new File("src/_2015/Day_2/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        Day_2IWasToldThereWouldBeNoMath noMath = new Day_2IWasToldThereWouldBeNoMath();
        int total = 0;
        while (br.ready()){
            String[] split = br.readLine().split("x");
            int l = Integer.parseInt(split[0]);
            int w = Integer.parseInt(split[1]);
            int h = Integer.parseInt(split[2]);
            int min = noMath.min(l,w,h);
            total += (l*w*h)+min;
        }
        System.out.println(total);
    }
}
