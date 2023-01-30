package shuzu;

public class fixedInterval {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int flag = 0;
        int result = 0;
        while (left <= right) {
            if (nums[(right + left) / 2] > target) {
                right = (right + left) / 2 - 1;
            } else if (nums[(right + left) / 2] < target) {
                left = (right + left) / 2 + 1;
            } else {
                flag++;
                result = (right + left) / 2;
                break;
            }
        }
        if (flag == 0) {
            return -1;
        } else
            return result;
    }

    public int search1(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int middle = (right + left) / 2;


        while (left < right) {
            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                break;
            }
        }

        if (nums[middle] == target)
            return middle;
        else
            return -1;
    }

    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int start = 0;
        int value =1;
        int loop = 1;//执行的圈数从1开始计数
        int flag = n;
        int i,j;
        while(flag>0) {
            for(i=start;i < n-loop;i++){
                nums[loop-1][i] = value;
                value++;
            }
            for(j = start;j < n-loop;j++){
                nums[j][n-loop] = value;
                value++;
            }
            for(;i>=loop;i--){
                nums[n-loop][i] = value;
                value++;
            }
            for(;j>=loop;j--){
                nums[j][loop-1] = value;
                value++;
            }
            loop++;
            start++;
            flag = flag-2;
        }
        if(n%2 == 1){
            nums[n/2][n/2] = value;
        return nums;
        }
        else
            return nums;
    }
}
