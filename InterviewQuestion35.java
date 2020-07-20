package swordfingeroffer;


/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion35
 * @date 2020-06-14 12:12
 */
public class InterviewQuestion35 {
    private void cloneNodes(ComplexListNode pHeader) {
        ComplexListNode pNode = pHeader;
        while (null != pNode) {
            ComplexListNode pClone = new ComplexListNode();
            pClone.value = pNode.value;
            pClone.next = pNode.next;
            pNode.next = pClone;
            pNode = pClone.next;
        }

    }
    private void connectSiblingNodes(ComplexListNode pHeader) {
        ComplexListNode pNode = pHeader;
        while (null != pNode) {
            ComplexListNode pClone = pNode.next;
            if (null != pNode.slibling) {
                pClone.slibling = pNode.slibling.next;
            }
            pNode = pClone.next;
        }

    }
    private ComplexListNode reconnectNodes(ComplexListNode pHeader) {
        ComplexListNode pNode = pHeader;
        ComplexListNode pCloneHeader = null;
        ComplexListNode pCloneNode = null;
        if (null != pNode) {
            pCloneHeader = pNode.next;
            pCloneNode = pNode.next;
            pNode.next = pCloneNode.next;
            pNode = pNode.next;
        }
        while (null != pNode) {
            pCloneNode.next = pNode.next;
            pCloneNode = pCloneNode.next;
            pNode.next = pCloneNode.next;
            pNode = pNode.next;
        }
        return pCloneHeader;
    }
    public ComplexListNode cloneNode(ComplexListNode pHeader) {
        cloneNodes(pHeader);
        connectSiblingNodes(pHeader);
        return reconnectNodes(pHeader);
    }
}
class ComplexListNode {
    int value;
    ComplexListNode next;
    ComplexListNode slibling;

}
