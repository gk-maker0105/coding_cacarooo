class Solution {
    public void reverseString(char[] s) {

        System.out.println(s);

        for(int i=0;i<s.length/2;i++){

            char temp=s[i];

            System.out.println("orginal "+s[i]+" "+s[s.length-1-i]);

            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;

            System.out.println("from reverse "+s[i]+" "+s[s.length-1-i]);

        }
    
    }
}