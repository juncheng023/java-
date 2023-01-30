package shuzu;

//使用相向指针解决数组的问题
public class oppositePointer {
    //删除元素 27
    public int removeElement(int[] nums,int val){
        int left = 0;
        int right = nums.length -1;
        while(right>=0 && nums[right] == val) right--;
        while(left <=right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            }
            left++;
            while (right >= 0 && right == val) right--;
        }
        for(int i=0;i<left;i++) {
            System.out.print(nums[i]+"   ");
        }
        return left;
    }

    //有序数组的平方 977
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int flag =nums.length-1;
        int[] result = new int[nums.length];
        while(left<=right){
            if((nums[left]*nums[left]) > (nums[right]*nums[right])) {
                result[flag] = nums[left]*nums[left];
                flag--;
                left++;
            }
            else if(nums[left]*nums[left] <= nums[right]*nums[right]){
                result[flag] = nums[right]*nums[right];
                flag--;
                right--;
            }
        }
            return result;
    }
}
