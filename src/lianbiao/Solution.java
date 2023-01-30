package lianbiao;
import listnode.ListNode;

import java.util.List;

public class Solution {
    public ListNode removeElements(ListNode head, int val){

        while(head!=null && head.val == val){
            head =head.next;
        }
        if(head == null){
            return head;
        }
        ListNode pre =head;
        ListNode cur =head.next;
        while(cur !=null){
            if(cur.val == val){
                pre.next = cur.next;
            }
            else {
                pre = cur;
            }

            cur= cur.next;
        }
        return head;
    }
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur != null){
            temp = cur.next; //保留cur连接的节点
            cur.next = pre; //让cur连接上一个节点
            cur = temp;
            pre = pre.next;
        }
        return pre;
    }
}
