class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public ListNode FindKthToTail(ListNode head,int k) {

        if (k <= 0 || head == null){
            return null;
        }

        int count = 1;
        ListNode pre = head;
        ListNode node = head;
        while (pre != null && pre.next != null){
            if (k <= count){
                node = node.next;
                pre = pre.next;
                count++;
            } else{
                pre = pre.next;
                count++;
            }
        }
        if (count < k){
            return null;
        }
        return node;
    }
}