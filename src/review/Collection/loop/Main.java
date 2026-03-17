package review.Collection.loop;

public interface Main {
    public static void main(String[] args) {
        // 이중 for 문 연습

        // 문제 1
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum1 = 0;
        for(int i=0; i < arr1.length;i++){
            for(int j=0; j < arr1[i].length; j++){
                if((i+j) % 2 == 0){
                    sum1+=arr1[i][j];
                }
            }
        }
        System.out.println(sum1);


        // 문제 2
        int n = 4;

        for(int i=1; i <= n; i++){
            for(int j=1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // 문제 3
        for (int i=n; i >= 1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //문제 4
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum2 = 0;
        for(int i=0;i < arr2.length; i++){
            for(int j = 0; j<arr2[i].length; j++){
                if(i!=j){
                    sum2+=arr2[i][j];
                }
            }
        }
        System.out.println(sum2);

        // 문제 5번
        int n2 = 5;
        for(int i=0; i<n2; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n2; i >= 1; i--){
            for (int j=0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 문제 6
        int[][] arr = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 1, 0}
        };
        int row = 0;
        int max_count = 0;
        int count;

        for(int i=0; i<arr.length; i++){
            count = 0;
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(max_count < count){
                max_count = count;
                row = i;
            }
        }
        System.out.println(row);

        // Level Up

        // 문제 1번
        int[][] arr3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int sum3 = 0;
        for (int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){
                if(i==j){
                    sum3+=arr3[i][j];
                }
                if(i == j || i + j == arr3.length - 1){
                    sum3 += arr3[i][j];
                }
            }
        }
        System.out.println(sum3);

        // 문제 2번


    }
}
