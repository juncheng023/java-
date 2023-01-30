package shuzu;
//删除后的元素被相邻元素覆盖，后面的元素整体向前移动，被删除的元素没了
public class fastSlowPointer {
    //27 移除元素
    public int removeElement(int[] nums,int val){
        int slowIndex = 0;
        for(int fastIndex= 0;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex] != val){
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }

        }
        for(int i=0;i<slowIndex;i++){
            System.out.print(nums[i]+"   ");
        }
        return slowIndex;
    }
    //26  移除重复项
    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        for(int fastIndex =1;fastIndex < nums.length;fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex]) {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
            }
        }
        return slowIndex+1;
    }
    //283  移除0，并且0放在数组后面
    public void moveZeroes(int[] nums) {
        int slowIdex = 0;
        for(int fastIndex = 0;fastIndex < nums.length;fastIndex++){
            if(nums[fastIndex] != 0){
                nums[slowIdex] = nums[fastIndex];
                slowIdex++;
            }
        }
        System.out.println(slowIdex);
        for(int i= slowIdex;i<nums.length;i++){
            nums[i] = 0;
        }
        for(int i= 0;i<nums.length;i++){
            System.out.print(nums[i]+"   ");
        }

    }





}

