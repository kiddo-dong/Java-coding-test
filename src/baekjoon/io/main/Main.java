package baekjoon.io.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 문제 1번
        // 정수 n을 입력받고, 다음줄에 n개의 정수를 입력받아 합을 출력
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 정수 입력 받음
        int n = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}