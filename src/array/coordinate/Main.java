package array.coordinate;

public class Main {
    public static void main(String[] args) {
        // 배열, 2차원 배열, for, 이중 for 문제가 아닌
        // 좌표를 생각하는 사고 부족

        // 좌표 출력 훈련
        System.out.println("배열의 좌표 (인덱스)");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("("+i+", "+j+") ");
            }
            System.out.println();
        }
        System.out.println();

        // =================================================
        // 배열의 값 및 좌표 출력
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("| ("+i+", "+j+") -> " + arr[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        //===============================================================================
        // 배열의 이동 연습하기
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] newArr1 = new int[arr1.length][arr1[0].length];
        // 문제 1. 오른쪽으로 한칸 이동하기
        for(int i = 0; i < arr1.length; i++){
            for(int j = 1; j < arr1[i].length; j++){
                newArr1[i][j] = arr1[i][j-1];
            }
        }
        for(int[] i:newArr1){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();


        // 문제 2. 왼쪽으로 한칸 이동
        int[][] newArr2 = new int[arr1.length][arr[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 1; j < arr1[i].length; j++){
                newArr2[i][j-1] = arr1[i][j];
            }
        }

        for(int[] i:newArr2){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();

        // 문제 3. 위로 한칸 이동
        int[][] newArr3 = new int[arr1.length][arr1[0].length];

        for (int i = 1; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                newArr3[i-1][j] = arr1[i][j];
            }
        }
        for(int[] i:newArr3){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();

        //문제 4번. 아래로 한칸 이동
        int[][] newArr4 = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length-1; i++){
            for(int j = 0; j < arr1[i].length; j++){
                newArr4[i+1][j] = arr1[i][j];
            }
        }

        for(int[] i:newArr4){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();


        // =======================================================================
        // Level 2

        //문제 5. 대각선을 기준으로 뒤집기

        int[][] newArr5 = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                if(i!=j){
                    newArr5[j][i] = arr1[i][j];
                } else {
                    newArr5[i][j] = arr1[i][j];
                }
            }
        }
        for(int[] i:newArr5){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();

        // 문제 6번 좌우 반전
        int[][] newArr6 = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++){
            for(int j = arr1[i].length-1; j >= 0; j--){
                newArr6[i][arr1.length-j-1] = arr1[i][j];
            }
        }

        for(int[] i:newArr6){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();

        //문제 7번 상하 반전
        int[][] newArr7 = new int[arr1.length][arr1[0].length];

        for (int i = arr1.length-1; i >= 0; i--){
            for(int j = 0; j < arr1[i].length; j++){
                newArr7[arr1.length-i-1][j] = arr1[i][j];
            }
        }
        for(int[] i:newArr7){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();

        //================================================
        // 회전

        // 90도 회전
        int[][] newArr8 = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                newArr8[i][arr1.length-1-j] = arr1[j][i];
            }
        }

        for(int[] i:newArr8){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();


        // 180도 회전
        int[][] newArr9 = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                newArr9[arr.length-1-i][arr[i].length-1-j] = arr1[i][j];
            }
        }

        for(int[] i:newArr9){
            for(int j: i){
                System.out.print(" | " + j);
            }
            System.out.println(" |");
        }
        System.out.println();
    }
}