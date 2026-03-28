package gptQuiz.array;


import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        //문제 1번
        String string1= "hello";

        char[] array1 = string1.toCharArray();

        for(int i= array1.length-1;i>=0;i--){
            System.out.print(array1[i]);
        }
        System.out.println();

        // 문제 2번
        int[] arr1 = {3, 7, 2, 9, 5};
        int max = arr1[0];
        int idx = 0;

        for (int i = 1; i < arr1.length; i++) {
            if(arr1[i] > max){
                max = arr1[i];
                idx = i;
            }
        }
        System.out.println("최대값 : " + max + " index : " + idx);

        // ============================================================================
        // Level up


        // 문제 1번 (kadane algorithem)
        int[] arr2 = {3, -2, 5, -1, 6, -3, 2};
        int maxSum = 0;
        int currentSum = 0;

        for(int i=0;i<arr2.length;i++){
            currentSum = 0;
            for(int j=0;j<=i;j++){
                currentSum += arr2[j];
            }
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);


        // 문제 2번 (배열 내 중복 찾기)
        int[] arr = {1, 3, 5, 3, 7, 9, 1};
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                if (arr[i] == arr[j] && i != j) {
                    set.add(arr[i]);
                }
            }
        }

        for (Integer instance : set){
            System.out.print(instance + " ");
        }
        System.out.println();

        // ===============================================================
        // 2차원 배열 (최댓값과 좌표찾기)
        // 문제 1번
        int[][] arr3 = {
                {3, 7, 2},
                {9, 5, 1},
                {4, 8, 6}
        };
        int max1 = arr3[0][0];
        int col1 = 0;
        int row1 = 0;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if(arr3[i][j] > max1){
                    max1 = arr3[i][j];
                    row1 = i;
                    col1 = j;
                }
            }
        }

        System.out.println("최대값: " + max1 + "  위치 : " + row1 + ", " + col1);


        // 문제 2 (시계방향 90도)
        int[][] arr4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] newArr4 = new int [arr4.length][arr4[0].length];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                newArr4[j][arr4[i].length-1-i] = arr4[i][j];
            }
        }

        for(int[] i : newArr4){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}