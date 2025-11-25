/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int len=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        ListNode curr2=head;

        
        for(int i=1;i<=len/2;i++){
            curr2=curr2.next;
        
        }
        //System.out.println(len);
        return curr2;
        //return null;
    }
}