class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10 && x>=0){
            return true;
        }

        int size=(int) Math.floor((Math.log10(x)))+1;

        //System.out.println(size);

        for(int i=1;i<=size/2;i++){

            // System.out.println(x/Math.pow(10,i-1));
            // System.out.println(x%Math.pow(10,i-1));

            int left= (int) (x/Math.pow(10,(size-i))) % 10;
            int right = (int) (x%(Math.pow(10,i))/Math.pow(10,(i-1)));

            System.out.println(left);
            System.out.println(right);

            if(left!=right){
                return false;
            }



            
        }


        return true;
        
        
    }
}