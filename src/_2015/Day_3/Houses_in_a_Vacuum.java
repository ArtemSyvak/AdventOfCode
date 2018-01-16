package _2015.Day_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Houses_in_a_Vacuum {

    public static void main(String[] args) throws Exception {
        File f = new File("src/_2015/Day_3/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        char [] symbols = br.readLine().toCharArray();
        boolean[][] houses = new boolean[symbols.length][symbols.length];
        for (int i=0;i<houses.length;i++){
            for (int j=0;j<houses.length;j++){
                houses[i][j] = false;
            }
        }
        int x=houses.length/2;
        int y=houses.length/2;
        int x1=houses.length/2;
        int y1=houses.length/2;
        int count = 1;
        houses[x][y] = true;
        for (int i = 0; i<symbols.length;i++){
            char house = symbols[i];
            if (i%2==0){
                switch (house){
                    case '^':
                        y++;
                        if (!houses[x][y]){
                            houses[x][y] = true;
                            count++;
                        }
                        break;
                    case 'v':
                        y--;
                        if (!houses[x][y]){
                            houses[x][y] = true;
                            count++;
                        }
                        break;
                    case '>':
                        x++;
                        if (!houses[x][y]){
                            houses[x][y] = true;
                            count++;
                        }
                        break;
                    case '<':
                        x--;
                        if (!houses[x][y]){
                            houses[x][y] = true;
                            count++;
                        }
                        break;
                }
            }else {
                switch (house){
                    case '^':
                        y1++;
                        if (!houses[x1][y1]){
                            houses[x1][y1] = true;
                            count++;
                        }
                        break;
                    case 'v':
                        y1--;
                        if (!houses[x1][y1]){
                            houses[x1][y1] = true;
                            count++;
                        }
                        break;
                    case '>':
                        x1++;
                        if (!houses[x1][y1]){
                            houses[x1][y1] = true;
                            count++;
                        }
                        break;
                    case '<':
                        x1--;
                        if (!houses[x1][y1]){
                            houses[x1][y1] = true;
                            count++;
                        }
                        break;
                }
            }
        }
        System.out.println(count);
    }

}
