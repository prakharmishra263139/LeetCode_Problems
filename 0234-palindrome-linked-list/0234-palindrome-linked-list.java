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
   

    public static ListNode reverse(ListNode head){
    ListNode prev = null;
    ListNode curr = head;
    ListNode Next = null;

    while(curr !=null){
        Next = curr.next;
        curr.next = prev;
        prev =curr;
        curr =Next;
    }

    return prev;
    }

     public boolean isPalindrome(ListNode head) {

        ListNode slow   = head;
        ListNode  fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow  =slow.next;
            fast = fast.next.next;
        }

        ListNode temp = reverse(slow.next);
        slow.next =temp;

        ListNode pOne = head;
        ListNode pTwo = slow.next;


        while(pTwo!=null){
            if(pOne.val != pTwo.val){
                return false;
            }
            pOne = pOne.next;
            pTwo = pTwo.next;
        }
    return true; 
    }

}