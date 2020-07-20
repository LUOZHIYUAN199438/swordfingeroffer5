package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-29.
 * @time 21:57
 */
public class InterviewQuestion182 {
    public static class ListNode{
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            throw new RuntimeException("链表不能为空kk！");
        }
        ListNode preNode = null;
        ListNode pNode = pHead;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            boolean toDelete = false;
            if (pNext != null && pNext.value == pNode.value) {
                toDelete = true;
            }
            if (!toDelete) {
                preNode = pNode;
                pNode = pNext;
            } else {
                ListNode pToBeDelete = pNode;
                int value = pNode.value;
                while (pToBeDelete != null && pToBeDelete.value == value) {
                    pNext = pToBeDelete.next;
                    pToBeDelete = pNext;
                }
                if (preNode == null) {
                    pHead = pNext;
                } else {
                    preNode.next = pNext;
                }
                pNode = pNext;
            }
        }
        return pHead;
    }

    public void printList(ListNode pHead) {
        if (pHead == null) {
            throw new RuntimeException("打印链表不能为空！");
        }
        ListNode pNode = pHead;
        while (pNode != null) {
            System.out.print(pNode.value + " ");
            pNode = pNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InterviewQuestion182 interviewQuestion182 = new InterviewQuestion182();
        ListNode pHead = new ListNode(5);
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(7);

        pHead.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        pHead = interviewQuestion182.deleteDuplication(pHead);
        interviewQuestion182.printList(pHead);
    }
}
