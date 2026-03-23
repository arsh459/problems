/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 *
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
 *
 * algorithms
 * Medium (57.25%)
 * Likes:    8670
 * Dislikes: 1182
 * Total Accepted:    1.7M
 * Total Submissions: 3M
 * Testcase Example:  '["2","1","+","3","*"]'
 *
 * You are given an array of strings tokens that represents an arithmetic
 * expression in a Reverse Polish Notation.
 * 
 * Evaluate the expression. Return an integer that represents the value of the
 * expression.
 * 
 * Note that:
 * 
 * 
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish
 * notation.
 * The answer and all the intermediate calculations can be represented in a
 * 32-bit integer.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= tokens.length <= 10^4
 * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the
 * range [-200, 200].
 * 
 * 
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st= new Stack<>();
        Set<String> operator= new HashSet<>();
        operator.add("+");
        operator.add("-");
        operator.add("/");
        operator.add("*");
        for(int i=0;i<tokens.length;i++){
            if(operator.contains(tokens[i])){
                Integer i1 =Integer.valueOf(st.pop());
                Integer i2 =Integer.valueOf(st.pop());
                Integer i3 = null;
                switch(tokens[i]){
                    case "+" :
                        i3 = i1+i2;
                        break;
                    case "-" :
                        i3 = i2-i1;
                        break;

                    case "*" :
                        i3 = i2*i1;
                        break;
                    case "/" :
                        i3 = i2/i1;
                        break;
                    default:
                        break;
                }
                st.push(String.valueOf(i3));

            }else{
                st.push(tokens[i]);
            }  
        }
        return Integer.valueOf(st.peek());
    }
}
// @lc code=end

