package review.Collection.array;

import java.util.Arrays;
import java.util.Scanner;

// 실화??? Spring만 하니까 다 까먹어 버렸다
public class Main {
    public static void main(String[] args) {
        // 1. 배열
        // 변수는 하나의 값만 저장이 가능함
        int score1 = 83;
        int score2 = 90;
        int score3 = 87; // 등등

        // 배열
        int[] scoreArray; // 배열 선언
        scoreArray = new int[20]; // 배열 초기화\
        // 인데스 0~19까지 존재

        // 배열 선언 및 초기화 -> 후에 value 대입
        int[] scoreArray2 = new int[20];

        //배열 선언 및 초기화 값 대입 -> 배열의 크기는 최대 5개 -> 추가 확장 불가능(메모리 할당 문제)
        int[] scoreArray3 = {1, 2, 3, 4, 5};
        //또는
        int[] scoreArray4 = new int[]{1, 2, 3, 4, 5};

        //======================================================================================
        // 2. 배열의 활용
        int[] array1 = {3, 4, 1, 2, 5};

        // 배열의 크기(길이)
        System.out.println(array1.length);

        // 배열 순회
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        // or
        for (int instance : array1) {
            System.out.print(instance + " ");
        }
        System.out.println();

        // 배열의 정렬
        Arrays.sort(array1);
        for (int instance : array1) {
            System.out.print(instance + " ");
        }
        System.out.println();

        // 배열 값 변경
        array1[0] = 100;
        array1[1] = 200;
        for (int instance : array1) {
            System.out.print(instance + " ");
        }
        System.out.println();

        // 배열 검색(200 찾기)
        System.out.println("200을 찾으세요.");
        boolean serch = false;
        for(int i=0; i<array1.length; i++){
            if(array1[i] == 200){
                serch = true;
                System.out.println(array1[i] + "이 존재합니다.");
            }
        }
        if(!serch){
            System.out.println("존재하지 않아요");
        }


        //===========================================================================================
        // 1.
        int[] arr = {3,7,2,9,4};
        for(int instance : arr){
            System.out.println(instance);
        }

        // 2.
        int[] arr2 = {8,3,15,2,10};
        int max = arr2[0];
        for(int i=1; i<arr2.length; i++){
            if(max<arr2[i]){
                max = arr2[i];
            }
        }
        System.out.println("가장 큰 값은 " + max + "입니다.");


        // 3.
        int[] arr3 = {5,10,15,20,25};
        Scanner scanner = new Scanner(System.in);
        boolean instance = false;
        int searchValue = scanner.nextInt();
        for(int i=0; i < arr3.length; i++){
            if(searchValue == arr3[i]){
                instance = true;
                System.out.println(arr3[i] + "이 존재합니다.");
                break;
            }
        }
        if(!instance){
            System.out.println("존재하지 않습니다.");
        }
        scanner.close();

        // 4.
        int[] arr4 = {1,2,3,4,5};
        for(int i = arr4.length-1; i >= 0; i--){
            System.out.println(arr4[i]);
        }

        // 5.
        int[] arr5 = {4,7,2,9,6,3};
        int count = 0;
        for(int ignored : arr5){
            if(ignored % 2 == 0){
                count++;
            }
        }
        System.out.println("짝수 개수 : " + count);


        // bonus
        int[] arr6 = {12,5,8,20,3};
        Arrays.sort(arr6);

        int minimum = arr6[0];
        int maximum = arr6[arr.length-1];

        System.out.println("최소값 : " + minimum);

        System.out.println("최대1값 : " + maximum);
    }
}
