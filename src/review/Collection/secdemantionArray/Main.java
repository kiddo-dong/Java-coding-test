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

        System.out.println("=====================================================");
        // ===================================================================
        // 기본 문제
        // 1. 전체 출력
        int[][] arr7 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int[] row3 : arr7){
            for(int instance: row3){
                System.out.print(instance+" ");
            }
            System.out.println();
        }

        // 2. 모든 배열의 합
        int sum = 0;
        for(int i = 0; i <arr7.length; i++){
            for(int j = 0; j <arr7[i].length; j++){
                sum += arr7[i][j];
            }
        }
        System.out.println(sum);

        // 3. 최댓값 찾기
        int max = 0;

        for(int i = 0; i <arr7.length; i++){
            for(int j = 0; j <arr7[i].length; j++){
                if(arr7[i][j] > max){
                    max = arr7[i][j];
                }
            }
        }
        System.out.println(max);

        // 4.
        for(int i = 0; i <arr7.length; i++){
            int rowsum = 0;
            for(int j = 0; j <arr7[i].length; j++){
                rowsum += arr7[i][j];
            }
            System.out.println(rowsum);
        }

        // 5. 열의 합 구하기

        int[][] arr8 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0; i <arr8[0].length; i++){
            int colsum = 0;
            for(int j = 0; j <arr8.length; j++){
                colsum += arr8[j][i];
            }
            System.out.println(colsum);
        }


        // 6. 배열 뒤집기
        for(int i = arr8.length-1; i >= 0; i--){
            for (int j = 0; j < arr8[i].length; j++){
                System.out.print(arr8[i][j]);
            }
            System.out.println();
        }

        // 7. 좌표 찾기 - 숫자 9의 좌표를 출력
        int[][] arr9 = {
                {5,2,3},
                {4,9,1},
                {7,8,6}
        };
        int serchValue = 9;
        boolean result = false;

        outer:
        for (int i = 0; i < arr9.length; i++) {
            for(int j = 0; j < arr9[i].length; j++){
                if(arr9[i][j] == serchValue){
                    result = true;
                    System.out.println("숫자 " + serchValue + "의 좌표값은 arr9[" + i + "][" + j + "]" + "입니다.");
                    break outer;
                }
            }
        }
        if(!result){
            System.out.println("찾는 값 " + serchValue + "는 존재하지 않습니다.");
        }

        // 8. 최대 값의 좌표 찾기
        int[][] arr10 = {
                {5,2,3},
                {4,9,1},
                {7,8,6}
        };

        int max1 = 0;

        // 최댓값 구하기
        for(int i = 0; i <arr10.length; i++){
            for(int j = 0; j <arr10[i].length; j++){
                if(max1 < arr10[i][j]){
                    max1 = arr10[i][j];
                }
            }
        }

        // 해당 인스턴스의 좌표값
        outer:
        for (int i = 0; i < arr10.length; i++) {
            for (int j = 0; j < arr10[i].length; j++) {
                if (arr10[i][j] == max1) {
                    System.out.println("최댓값 " + max1 + "의 좌표값은 arr9[" + i + "][" + j + "]" + "입니다.");
                    break outer;
                }
            }
        }
    }
}
