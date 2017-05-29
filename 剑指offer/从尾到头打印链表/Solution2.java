import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null){
            if (listNode.next != null){
                this.printListFromTailToHead(listNode.next);
            }
            list.add(listNode.val);
        }
        return list;       
    }
}