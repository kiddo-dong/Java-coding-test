package review.Collection.secdemantionArray;

public class Main {
    public static void main(String[] args) {
        // ===== 2차원 배열 =====

        // 1. 선언 후 초기화
        int[][] arr1; // 변수 선언만
        arr1 = new int[3][4]; // 초기화 및 생성

        // 2. 선언 및 초기화
        int[][] arr2 = new int[3][4];

        // 3. 선언 및 리터럴 초기화
        int [][] arr3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //======================================================================
        // 2차원 배열의 접근
        int [][] arr4 = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(arr4[0][0]); // 1
        System.out.println(arr4[1][2]); // 6
        // 인스턴스 수정(인스턴스 7 -> 700)
        arr4[2][0] = 700;
        System.out.println(arr4[2][0]);

        // 2차원 배열의 배열 크기
        int [][] arr5 = {{1,2,3}, {4,5,6}, {7,8,9}};

        int row = arr5.length;
        int col = arr5[0].length;
        System.out.println(row * col);

        //================================================================
        // 반복문
        // 2차원 배열 전체 출력
        int [][] arr6 = {{1,2,3}, {4,5,6}, {7,8,9}};

        // 일반 for 문
        for(int i=0;i<arr6.length;i++){
            for(int j=0;j<arr6[i].length;j++){
                System.out.print(arr6[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("============");

        // 향상된 for문
        for(int[] row2: arr6){
            for(int instance: row2){
                System.out.print(instance+" ");
            }
            System.out.println();
        }


    }
}
