package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-27.
 * @time 23:27
 */
public class InterviewQuestion18 {
    public static class ListNode{

        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode deleteListNode(ListNode listHeader,ListNode deleteNode){

        if (listHeader == null || deleteNode == null){
            return null;
        }
        // 要删除的节点在中间
        if (deleteNode.next != null){
            ListNode tempListNode = deleteNode.next;
            deleteNode.value = tempListNode.value;
            deleteNode.next = tempListNode.next;
        }else if (listHeader == deleteNode){
            listHeader = null;
        }else {
            ListNode tempListNode = listHeader;
            while (tempListNode.next != deleteNode){
                tempListNode = tempListNode.next;
            }
            tempListNode.next = null;
        }

        return listHeader;
    }

    public void printList(ListNode listNode) throws Exception {

        if (listNode == null){
            throw new Exception("链表不能为空！");
        }

        while (listNode != null){
            System.out.print(listNode.value + " ");
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {
        InterviewQuestion18 interviewQuestion18 = new InterviewQuestion18();
        ListNode listHeader = new ListNode(5);
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(10);
        ListNode listNode3 = new ListNode(15);

        listHeader.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listHeader = interviewQuestion18.deleteListNode(listHeader, listHeader);
        try {
            interviewQuestion18.printList(listHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}