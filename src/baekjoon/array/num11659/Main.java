package baekjoon.array.num11659;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 배열의 크기(n) & 합 횟수(m)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 구간 합 배열 선언 및 대입
        int[] arr = new int[n+1]; // -> 자바 언어 특성
        // arr = {0, 0, 0, 0, 0, 0} 으로 선언시 내부적 초기화됨
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1]+ Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            bw.write(arr[sec]-arr[fir-1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
