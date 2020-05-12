/**
 * 将两个升序链表合并为一个新的升序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 来源：力扣（LeetCode）
 */
public class Solution4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //设置一个空链表，起始为0
        ListNode dom = new ListNode(0);
        ListNode head = dom;
        while (l1 != null && l2 != null){
            if(l1.val<l2.val){
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        if(l1 == null){
            head.next = l2;
        }else if(l2 == null){
            head.next = l1;;
        }
        return dom.next;
    }
}
