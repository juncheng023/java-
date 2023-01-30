package shuzu;

public class slidWindow {
    // 209 长度最小的子数组
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right =0;right<nums.length;right++){
            sum+=nums[right];
            while(sum >= target){
                result = Math.min(result,right - left +1);
                sum-=nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE ?0:result;



    }
}
