package swordfingeroffer;

import java.util.Stack;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-03-26.
 * @time 18:20
 */
public class InterviewQuestion6 {
    // 链表节点
    private static class ListNode{
        private int nodeValue;
        private ListNode listNode;

        private ListNode(int nodeValue){
            this.nodeValue = nodeValue;
        }
    }

    // 用栈的方式实现
    public void outputFromLastNode(ListNode root){

        // 判断链表是否为空
        if (root == null){
            System.out.println("链表为空！");
            return ;
        }

        Stack<ListNode> stack = new Stack<ListNode>();

        // 遍历链表
        ListNode curNode = root;
        while (curNode != null){

            stack.add(curNode);
            curNode = curNode.listNode;
        }

        while (!stack.empty()){
            System.out.println(stack.pop().nodeValue);
        }
    }

    public static void main(String[] args) {
        InterviewQuestion6 interviewQuestion6 = new InterviewQuestion6();
        ListNode root = new ListNode(1);
        ListNode root1 = new ListNode(2);
        ListNode root2 = new ListNode(3);

        //interviewQuestion6.outputFromLastNode(null);
        //interviewQuestion6.outputFromLastNode(root);

        root.listNode = root1;
        root1.listNode = root2;
        interviewQuestion6.outputFromLastNode(root);
    }
}
