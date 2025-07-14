class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left=0;
        int maxF=0;
        int maxWindow=0;
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'A']++;
            maxF=Math.max(maxF,freq[s.charAt(i)-'A']);
            int windowLength=i-left+1;
            if(windowLength-maxF>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowLength=i-left+1;
            maxWindow=Math.max(maxWindow,windowLength);
        }
        return maxWindow;
    }
}
