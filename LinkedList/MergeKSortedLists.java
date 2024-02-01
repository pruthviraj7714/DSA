package LinkedList;

import java.util.*;

public class MergeKSortedLists {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //brute force -> Time complexity : (N X K) + M log M + M
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while(temp != null) {
                ans.add(temp.val);
                temp = temp.next;
            }
        }

        Collections.sort(ans);

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(int i = 0; i < ans.size(); i++) {
            curr.next = new ListNode(ans.get(i));
            curr = curr.next;
        }

        return dummy.next;

    }




    
}
