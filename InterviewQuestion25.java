package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-31.
 * @time 20:57
 */
public class InterviewQuestion25 {
    public static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }
    public ListNode mergeList(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode mergeListNode = null;
        ListNode mergeNode = mergeListNode;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                if (mergeNode == null) {
                    mergeNode = list2;
                } else {
                    mergeNode.next = list2;
                }
                if (mergeListNode == null) {
                    mergeListNode = mergeNode;
                }
                break;
            }
            if (list2 == null) {
                if (mergeNode == null) {
                    mergeNode = list1;
                } else {
                    mergeNode.next = list1;
                }
                if (mergeListNode == null) {
                    mergeListNode = mergeNode;
                }
                break;
            }
            ListNode tempNode = null;
            if (list1.value < list2.value) {
                tempNode = list1;
                list1 = list1.next;
                tempNode.next = null;
                if (mergeNode == null) {
                    mergeNode = tempNode;
                } else {
                    mergeNode.next = tempNode;
                    mergeNode = mergeNode.next;

                }
            } else {
                tempNode = list2;
                list2 = list2.next;
                tempNode.next = null;
                if (mergeNode == null) {
                    mergeNode = tempNode;
                } else {
                    mergeNode.next = tempNode;
                    mergeNode = mergeNode.next;

                }
            }
            if (mergeListNode == null) {
                mergeListNode = mergeNode;
            }
        }
        return mergeListNode;
    }

    public void printList(ListNode pHead) {
        if (pHead == null) {
            throw new RuntimeException("链表不能为空！");
        }
        ListNode temp = pHead;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);

        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(4);

        listNode1.next = listNode2;
        listNode3.next = listNode4;

        InterviewQuestion25 interviewQuestion25 = new InterviewQuestion25();
        ListNode resultList = interviewQuestion25.mergeList(listNode1,listNode3);
        interviewQuestion25.printList(resultList);
    }
}
