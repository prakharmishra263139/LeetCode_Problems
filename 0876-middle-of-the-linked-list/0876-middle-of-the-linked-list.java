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
        
        
       ListNode temp =head;

       int len=0;

       while(temp!=null){
            temp = temp.next;
            len++;
       }
       len = len/2;
       ListNode t   = head;
       for(int i=0;i<len;i++){
          t = t.next;
    }
return t; 
   }
}