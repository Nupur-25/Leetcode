/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeft(nums, target);
        int right = findRight(nums,target);
        return new int[]{left,right};
    }
    private int findLeft(int[] nums, int target){
        int index=-1, low=0, high=nums.length-1;
        while(low<=high){
            int mid= low + (high-low)/2;
            if(nums[mid]==target){
                index = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return index;
    }
    private int findRight(int[] nums, int target){
        int index=-1, low=0, high=nums.length-1;
        while(low<=high){
            int mid= low + (high-low)/2;
            if(nums[mid]==target){
                index = mid;
                low = mid+1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return index;
    }
}
