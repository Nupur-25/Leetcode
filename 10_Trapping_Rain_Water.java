class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        int sum = 0;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            sum+=(Math.min(leftMax[i],rightMax[i]) - height[i]);
        }
        return sum;
    }
}
