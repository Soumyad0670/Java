1class Solution {
2    public void duplicateZeros(int[] arr) {
3        for (int i = 0; i < arr.length - 1; i++) {
4            if (arr[i] == 0) {
5                for (int j = arr.length - 1; j > i + 1; j--) {
6                    arr[j] = arr[j - 1];
7                }
8                arr[i + 1] = 0;
9                i++; 
10            }
11        }
12    }
13}
14