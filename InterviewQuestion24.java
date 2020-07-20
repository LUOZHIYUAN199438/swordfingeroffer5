package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-31.
 * @time 20:01
 */
public class InterviewQuestion24 {
    public static class ListNode {

        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }
    public ListNode reverseList(ListNode pHead) {
        if (pHead == null) {
            throw new RuntimeException("链表不能为空！");
        }
        ListNode reverseNode = null;
        ListNode pNode = pHead;
        ListNode preNode = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null) {
                reverseNode = pNode;
            }
            pNode.next = preNode;
            preNode = pNode;
            pNode = pNext;
        }
        return reverseNode;
    }
}
