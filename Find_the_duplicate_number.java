class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return len;
    }
}
  