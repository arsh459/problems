/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 *
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 *
 * algorithms
 * Medium (37.48%)
 * Likes:    32498
 * Dislikes: 2000
 * Total Accepted:    4.6M
 * Total Submissions: 12.3M
 * Testcase Example:  '"babad"'
 *
 * Given a string s, return the longest palindromic substring in s.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "cbbd"
 * Output: "bb"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        String maxSub= "" + s.charAt(0);
        for(int i=0;i<s.length();i++){
            String sub = "" + s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                sub= sub + s.charAt(j);
                maxSub = findMaxPalindrome(maxSub,sub);
            }
        }
        return maxSub;
    }

    public String findMaxPalindrome(String maxSub, String sub){
        if(sub.length() <= maxSub.length()){
            return maxSub;
        }
        if(!isPalindromeString(sub)){
            return maxSub;
        }
        return sub;
    } 

    public boolean isPalindromeString(String k){
        String a="";
        for(int i= k.length()-1;i>=0 ;i--){
            a = a + k.charAt(i);
        }
        return a.equals(k);
    }
}
// @lc code=end

