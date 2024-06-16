//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    int countCoPrime(int a[], int n)
    { int count=0;
        for(int i=0;i<n-1;i++)
    {
        if(gcd(a[i],a[i+1])!=1){
            count++;
        }
    }
    return count;
        // Complete the function
    }
    int gcd(int n1,int n2){
        if(n1==0||n2==0){
            return 0;
        
        }
        if(n1==n2){
            return n1;
        }
        if(n1>n2){
            return gcd(n1-n2,n2);
        }
        return gcd(n1,n2-n1);
    }
}


//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.countCoPrime(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}


        

// } Driver Code Ends