package algoCodingTest.ch01.num00;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
        // output
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n개의 수가 주어짐
        int count = Integer.parseInt(dr.readLine());

        int[] arr = new int[count];

        for (int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(dr.readLine());
        }

        Arrays.sort(arr);

        for (int i : arr){
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        dr.close();
    }
}