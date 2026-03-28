package baekjoon.array.num10798.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];

        // 입력
        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
        }

        // 최대 길이 찾기
        int max = 0;
        for (int i = 0; i < 5; i++) {
            max = Math.max(max, arr[i].length());
        }

        // 세로 읽기
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < arr[i].length()) {
                    System.out.print(arr[i].charAt(j));
                }
            }
        }
    }
}
