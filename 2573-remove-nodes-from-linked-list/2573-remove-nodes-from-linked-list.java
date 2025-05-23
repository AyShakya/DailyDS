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
    private ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode nexx=null;
        while(curr!=null){
            nexx=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nexx;
        }
        return prev;
    }
    private ListNode delAft(ListNode head){
        if(head.next.next==null){
            head.next=null;
            return null;
        }
        ListNode temp=head.next.next;
        head.next=temp;
        return head;
    }
    public ListNode removeNodes(ListNode head) {
        head=reverseList(head);
        ListNode temp=head;
        while(temp!=null){
            int value = temp.val;
            if(temp.next==null){
                break;
            }
            if(temp.next.val<value){
                temp=delAft(temp);
            }
            else{
                temp=temp.next;
            }
        }
        head=reverseList(head);
        return head;
    }
}