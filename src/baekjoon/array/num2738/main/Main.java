package baekjoon.array.num2738.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer rowCol = new StringTokenizer(br.readLine());

        // 행열 크기 n, m
        // rowCol = "3 3";
        int n = Integer.parseInt(rowCol.nextToken()); //
        int m = Integer.parseInt(rowCol.nextToken());

        // 배열 2개
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        // 배열 instance 주입
        for(int i=0; i<a.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<a[i].length; j++){
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<b.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<b[i].length; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
