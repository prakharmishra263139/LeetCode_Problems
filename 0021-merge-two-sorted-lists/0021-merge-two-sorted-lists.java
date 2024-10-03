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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempOne = list1;
        ListNode tempTwo = list2;

        ListNode head = new ListNode(100);
        ListNode temp = head;

        while(tempOne!=null && tempTwo!=null){
            if(tempOne.val<tempTwo.val){
                ListNode a = new ListNode(tempOne.val);
                temp.next = a;
                temp=a;
                tempOne = tempOne.next;
            }else{
                ListNode a = new ListNode(tempTwo.val);
                temp.next = a;
                temp=a;
                tempTwo = tempTwo.next;

            }
        }

        if(tempOne==null){
            temp.next = tempTwo;
        }else{
            temp.next = tempOne;
        }

        return head.next;
    }
}