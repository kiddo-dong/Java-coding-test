package baekjoon.sum.num11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 숫자 count
        int n = Integer.parseInt(br.readLine());

        // 문자열받기(한번에)
        String str = br.readLine();

        // 합 변수
        int sum=0;

        // String 변수를 CharArray로 봄
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
