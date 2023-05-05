// Calculate the number of ways to reach (n-1, m-1)?
// Rules: Pointer will only travel in right direction or down, on other direction is allowed
// Time Complexity: O(2^(n+m)

//Other ways to solve this problem with linear time complexity(O(n+m)): that is using concept of permutation
// Formula: ((n-1)+(m-1))!/ (n-1)! * (m-1)!
public class GridWays {
 public static int gridWays(int i, int j, int n, int m){
     //base case
     if(i >= n || j >= m){
         return 0;
     }
     else if(i == n-1 && j == m-1){
         return 1;
     }
     int w1= gridWays(i+1, j, n, m);
     int w2= gridWays(i, j+1, n, m);
     return w1+w2;
 }
    public static void main(String[] args){
        int n = 2, m=3;
        System.out.println(gridWays(0,0, n, m));
    }
}
