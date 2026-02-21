class Solution {
    public boolean isPerfectSquare(int num) {


        if(num==1){
            return true;
        }

        if(num%2==0){
            for(int i=0;i<=num/4;i++){
                if(i*i==num/4){
                    return true;
                }
            }
        }
        else{
            int target=num-1;
            for(int i=0;i<target/4;i++){
               if((i)*(i+1)==target/4){
                return true;
               } 
            }
        }

        return false;
    }
}