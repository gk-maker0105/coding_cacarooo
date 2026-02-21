class Solution {
    public boolean isPerfectSquare(int num) {


        long start=1;

        long end=num;

        

        while(start<=end){

            long mid=start+(end-start)/2;

            if(mid*mid==num){
                return true;
            }

            if(mid*mid<num){//mid is small
                start=mid+1;
            }
            if(mid*mid>num){//mid is big
                end=mid-1;
            }
        }

        return false;
        
    }
}