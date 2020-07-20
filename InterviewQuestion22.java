package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-31.
 * @time 17:18
 */
public class InterviewQuestion22 {
    public static class ListNode{
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }
    public ListNode findKthFromTail(ListNode listHead, int k) {
        if (k <= 0) {
            throw new RuntimeException("k不能小于等于0");
        }
        if (listHead == null) {
            throw new RuntimeException("链表不能为空！");
        }
        ListNode preListNode = listHead;
        for (int i = 0; i < k - 1; i++) {
            if (preListNode == null) {
                throw new RuntimeException("链表的长度无法找到倒数第" + k + "个节点");
            }
            preListNode = preListNode.next;
        }
        ListNode postListNode = listHead;
        while (preListNode.next != null) {
            preListNode = preListNode.next;
            postListNode = postListNode.next;
        }
        return postListNode;
    }

    public static void main(String[] args) {
        InterviewQuestion22 interviewQuestion22 = new InterviewQuestion22();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode resultNode = interviewQuestion22.findKthFromTail(listNode,3);
        System.out.println(resultNode.value);
    }
}
