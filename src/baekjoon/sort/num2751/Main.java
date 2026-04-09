package baekjoon.sort.num2751;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 정렬 개수
        int n = Integer.parseInt(br.readLine());

        // 배열로 정렬
        int[] arr = new int[n];

        // value 주입
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 정렬 및 출력
        Arrays.sort(arr);

        for(int i: arr){
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
