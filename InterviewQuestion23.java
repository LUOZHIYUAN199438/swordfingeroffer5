package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-31.
 * @time 19:33
 */
public class InterviewQuestion23 {
    public static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }
    private ListNode meetListNode(ListNode pHead) {
        if (pHead == null) {
            throw new RuntimeException("链表不能为空！");
        }
        ListNode pSlow = pHead.next;
        if (pSlow == null) {
            return null;
        }
        ListNode pFast = pSlow.next;
        while (pFast != null && pSlow != null) {
            if (pFast == pSlow) {
                return pFast;
            }
            pSlow = pSlow.next;
            pFast = pFast.next;
            if (pFast != null) {
                pFast = pFast.next;
            }
        }
        return null;
    }
    public ListNode entryNodeOfLoop(ListNode pHead) {
        ListNode meetNode = meetListNode(pHead);
        if (meetNode == null) {
            return null;
        }
        // 得到环的节点数量
        int loopNodeNum = 1;
        ListNode pNode = meetNode;
        while (pNode.next != meetNode) {
            pNode = pNode.next;
            loopNodeNum ++;
        }
        ListNode preNode = pHead;
        for (int i = 0; i < loopNodeNum; i++) {
            preNode = preNode.next;
        }
        ListNode postNode = pHead;
        while (preNode != postNode) {
            preNode = preNode.next;
            postNode = postNode.next;
        }
        return preNode;
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);


        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode3;
        InterviewQuestion23 interviewQuestion23 = new InterviewQuestion23();
        ListNode resultNode = interviewQuestion23.entryNodeOfLoop(listNode1);
        System.out.println(resultNode.value);
    }
}
