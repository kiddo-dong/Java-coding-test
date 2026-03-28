package baekjoon.basic.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 백준 코딩테스트 준비

        // 1. 백준 코딩테스트에는 테스트케이스의 입력과 출력이 존재한다.

        // 기본적으로 사용하는 입출력에는
        // BufferedReader
        // StringTokenizer 이 두가지가 존재한다

        // Scanner 사용
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();
        // 사용이 쉽지만 속도가 느리다. -> 입력받는 데이터가 많으면 치명적으로 느리다.
        // 속도가 느린 이유??
        // 내부에서 정규식 처리, 타입 파싱, 안전성 체크를 싹다 해줌
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.printf(line);
        // 문자열만 주기 때문에 자료형 변환은 직접 해야한다.
        int nn = Integer.parseInt(br.readLine());
        System.out.println(nn);

        // 하지만 여기서 입력을 "10 20 30 40"으로 주면 해당 문자열을 변환 시 띄어쓰기 문제가 발생한다.
        // 해결방안으로 StringTokenizer를 사용한다.
        StringTokenizer st = new StringTokenizer(br.readLine());




        // 2. 알고리즘 및 코딩테스트를 제대로 진행하려면 다양한 자료구조와 기본적인 알고리즘을 알아야한다.
        /*
        Array - 배열
        List - 리스트
        Stack - 스택
        Queue - 큐
        Map/Set - 맵,셋
        */
        int[] array = new int[5];

        ArrayList<Integer> arrayList = new ArrayList();
        LinkedList<Double> linkedList = new LinkedList();

        Stack<String> stack = new Stack<>();

        Queue<Integer> queue = new LinkedList<>();

        Map<String, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        // 3. 핵심 알고리즘 5개
        /*
        완전 탐색
        정렬 + 그리디
        BFS
        DFS
        이분 탐색 등등
        */
    }
}
