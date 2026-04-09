package baekjoon.basic.num1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과목의 개수 & 점수
        int n = Integer.parseInt(br.readLine());
        StringTokenizer subScore = new StringTokenizer(br.readLine());

        // 과목 점수들 + max값
        int[] subArr = new int[n];
        int max = 0;
        for(int i = 0; i<n; i++){
            subArr[i] = Integer.parseInt(subScore.nextToken());
            if(subArr[i]>max){
                max = subArr[i];
            }
        }

        float sum = 0;
        // 세준이의 점수 조작
        for(int i = 0; i<subArr.length; i++){
            sum += (subArr[i]/ (float)max) * 100;
        }
        System.out.println(sum/n);
    }
}
