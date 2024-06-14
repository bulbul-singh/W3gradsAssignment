class Solution {
    public boolean isPalindrome(int x) {
       int reverse=0;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int temp=x;
        while(x!=0){
           int  r=x%10;
           if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && r > 7))
                
               return false;
          if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && r < -8))
                return false;

           reverse=reverse*10+r;
           x=x/10;
        }
        
        return reverse==temp ;
       
        
    }
}
