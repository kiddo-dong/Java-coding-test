package baekjoon.basic.num5717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = 1;
        int f = 1;

        while (m != 0 && f !=0) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            f = Integer.parseInt(st.nextToken());
            sum = m + f;
            if(sum !=0 ) {
                System.out.println(sum);
            }
        }
    }
}
