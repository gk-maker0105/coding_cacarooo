class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 ){
            return false;
        }
        if(x>=10 && x%10==0){
            return false;
        }
        if(x<10 && x>=0){
            return true;
        }
        int rev=0;

        while(x>rev){
            rev=rev*10+x%10;
            x=x/10;

            
        }
        if(x==rev || rev/10 == x){
            return true;
        }
        

        return false;
        
        
    }
}