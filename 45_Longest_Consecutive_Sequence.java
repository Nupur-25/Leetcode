/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3*/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashMap<Integer, Boolean> ans = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            ans.put(nums[i], Boolean.FALSE);
        }
        int longLength=0;
        for(int i=0; i<nums.length; i++){
            int currlength=1;
            int nextNum= nums[i]+1;
            while(ans.containsKey(nextNum) && ans.get(nextNum)==false){
                currlength++;
                ans.put(nextNum, Boolean.TRUE);
                nextNum++;
            }
            int prevNum= nums[i]-1;
            while(ans.containsKey(prevNum) && ans.get(prevNum)==false){
                currlength++;
                ans.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
            longLength = Math.max(longLength,currlength);
        }
        return longLength;
    }
}
