# MinimumNumberOFSQuare-DP


Minimum Number Of Squares
Send Feedback
Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.<br>
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. Output will be 1, as 1 is the minimum<br>
count of numbers required.<br>
Note : x^y represents x raise to the power y.<br>
Input Format :<br>
Integer N<br>
Output Format :<br>
Required minimum count<br>
Constraints :<br>
1 <= N <= 1000<br>
Sample Input 1 :<br>
12<br>
Sample Output 1 :<br>
3<br>
Sample Output 1 Explanation :<br>
12 can be represented as :<br>
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 <br>
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 2^2<br>
1^1 + 1^1 + 1^1 + 1^1 + 2^2 + 2^2<br>
2^2 + 2^2 + 2^2<br>
As we can see, the output should be 3. <br>
Sample Input 2 :<br>
9<br>
Sample Output 2 :<br>
1<br>
