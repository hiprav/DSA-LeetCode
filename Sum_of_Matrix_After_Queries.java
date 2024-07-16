package com.leet_code;

public class Sum_of_Matrix_After_Queries {
    public static void main(String[] args) {
        int[][] arr={{0,0,1},{1,2,2},{0,2,3},{1,0,4}};
        int n=3;
        System.out.println(matrixSumQueries(n,arr));
    }
    public static long matrixSumQueries(int n, int[][] queries) {// this is brutfroce
        int[][] arr=new int[n][n];
        long sum=0;
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[queries[i][1]][j]!=0){
                        sum-=arr[queries[i][1]][j];
                    }
                    arr[queries[i][1]][j]=queries[i][2];
                    sum+=arr[queries[i][1]][j];
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (arr[j][queries[i][1]]!=0){
                        sum-=arr[j][queries[i][1]];
                    }
                    arr[j][queries[i][1]]=queries[i][2];
                    sum+=arr[j][queries[i][1]];
                }
            }
        }
        return sum;
    }
    public long matrixSumQueries2(int n, int[][] queries) {//very danger sum
        long sum = 0;
        boolean[] seenRow = new boolean[n];
        boolean[] seenCol = new boolean[n];
        int remainingRows = n;
        int remainingCols = n;

        // Process queries in reverse order
        for (int i = queries.length - 1; i >= 0; i--) {
            int type = queries[i][0];
            int index = queries[i][1];
            int val = queries[i][2];

            if (type == 0) { // Row operation
                if (!seenRow[index]) {
                    sum += (long) val * remainingCols;
                    seenRow[index] = true;
                    remainingRows--;
                }
            } else { // Column operation
                if (!seenCol[index]) {
                    sum += (long) val * remainingRows;
                    seenCol[index] = true;
                    remainingCols--;
                }
            }
        }

        return sum;
    }
}
