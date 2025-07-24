/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.*/

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        if(intervals.length==1) return intervals;
        for(int i=0; i<intervals.length; i++){              
            int start=intervals[i][0];
            int end=intervals[i][1];
            int j=i+1;
            for(j=i+1; j<intervals.length; j++){
                if(intervals[j][0]<=end){
                    end = Math.max(end,intervals[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(new int[]{start,end});
            i=j-1;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
