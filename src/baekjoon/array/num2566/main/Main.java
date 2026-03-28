package baekjoon.array.num2566.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] num = new int[9][9];

        for(int i = 0; i < num.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num[i].length; j++){
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxValue = num[0][0];
        int row = 1;
        int col = 1;

        for(int i=0; i < num.length; i++){
            for (int j=0; j<num[i].length; j++){
                if(maxValue <= num[i][j]){
                    maxValue = num[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(row + " " + col);
    }
}
