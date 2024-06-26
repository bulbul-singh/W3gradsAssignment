//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr, int n) {
        // your code here
        int maxR=arr[0];
        int step=arr[0];
        int jump=1;
        if(n==1)
        return 0;
        else if(arr[0]==0)
        return -1;
        else{
            for(int i=1;i<n-1;i++){
               
                maxR=Math.max(maxR,i+arr[i]);
               step--;
               if(step==0){
               jump++;
               if(i>=maxR){
                   return -1;
               }
               
               step=maxR-i;
               }
            }
        
              
        }
        if (maxR >= n - 1)
                return jump;
            else
                return -1;
        
    }
}