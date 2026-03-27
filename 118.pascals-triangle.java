/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (78.75%)
 * Likes:    14919
 * Dislikes: 567
 * Total Accepted:    2.6M
 * Total Submissions: 3.3M
 * Testcase Example:  '5'
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it as shown:
 * 
 * 
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= numRows <= 30
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> initialList  = new ArrayList<>();
        initialList.add(1);
        res.add(initialList);
        for(int i = 1 ;i < numRows ; i++) {
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<=i;j++){
                Integer jValue = 0;
                if(j==0){
                    jValue = res.get(i-1).get(j);   
                }else if(j==i){
                    jValue = res.get(i-1).get(j-1);   
                }else{
                    jValue = res.get(i-1).get(j-1) + res.get(i-1).get(j);   
                }
                li.add(jValue);
            }
            res.add(li);
        }

        return res;
    }
}
// @lc code=end

