/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.*/

class Solution {
    public boolean isHappy(int n) {
        List<Integer> l= new ArrayList<>();
        while(true){
            int sum=0;
            while(n!=0){
                int rem= n%10;
                sum=sum+rem*rem;
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            n=sum;
            if(l.contains(n)){
                return false;
            }
            l.add(n);
        }
    }
}
