/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 *
 * https://leetcode.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (49.68%)
 * Likes:    11798
 * Dislikes: 5602
 * Total Accepted:    3.7M
 * Total Submissions: 7.4M
 * Testcase Example:  '[1,2,3]'
 *
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the i^th digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of
 * digits.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {

        int i = digits.length - 1;
        int carryOn = 0;
        while(i>=0){
            if(i==digits.length-1){
                digits[i]=digits[i]+1;
            }
            digits[i]=digits[i]+carryOn;
            if(digits[i]==10){
                digits[i] = 0;
                carryOn= 1;
            }else{
                carryOn=0;
            }
            i--;
        }


        if(carryOn == 1){
            int[] a= new int[digits.length+1];
            for(i=1;i<=digits.length;i++){
                a[i]=digits[i-1];
            }
            a[0]=1;
            return a;
        }
        return digits;
    }
}
// @lc code=end

