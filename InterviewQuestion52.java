package swordfingeroffer;

import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion52
 * @date 2020-07-04 16:31
 */
public class InterviewQuestion52 {
    public ListNode findFirstCommonNode(ListNode listNode1, ListNode listNode2) {
        int listNode1Len = getListLength(listNode1);
        int listNode2Len = getListLength(listNode2);
        int gapLen = listNode1Len - listNode2Len;
        ListNode listNodeLong;
        ListNode listNodeShort;
        if (gapLen > 0) {
            listNodeLong = listNode1;
            listNodeShort = listNode2;
        } else {
            listNodeLong = listNode2;
            listNodeShort = listNode1;
        }
        for (int i = 0; i < gapLen; i++) {
            listNodeLong = listNodeLong.next;
        }
        while (null != listNodeLong && null != listNodeShort && listNodeLong != listNodeShort) {
            listNodeLong = listNodeLong.next;
            listNodeShort = listNodeShort.next;
        }
        ListNode sampleListNode = listNodeLong;
        return sampleListNode;
    }
    private int getListLength(ListNode pHeader) {
        int listLength = 0;
        ListNode pNode = pHeader;
        while (null != pNode) {
            listLength ++;
            pNode = pNode.next;
        }
        return listLength;
    }
}
class ListNode {
    int value;
    ListNode next;
}