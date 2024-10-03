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

import java.lang.Math;
import java.io.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode head = l3;
        int carried = 0, sum, l1val, l2val;
        
        while (l1 != null || l2 != null){
            if (l1 == null) l1val = 0;
            else l1val = l1.val;
            
            if (l2 == null) l2val = 0;
            else l2val = l2.val;

            sum = l1val + l2val + carried;
            carried = sum/10;
            
            ListNode new_node = new ListNode(sum%10);
            l3 = l3.next = new_node;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carried != 0) {
            ListNode new_node = new ListNode(carried);
            l3.next = new_node;
        }

        return head.next;
    }
}