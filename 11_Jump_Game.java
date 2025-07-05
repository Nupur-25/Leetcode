class Solution {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length-1;
        for(int i = nums.length-2; i>=0; i--){
            int res = nums[i]+i;
            if(res>=lastPos){
                lastPos=i;
            }
        }
        if(lastPos==0){
            return true;
        }
        else{
            return false;
        }
    }
}
