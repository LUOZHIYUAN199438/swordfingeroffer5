package swordfingeroffer;

import java.util.Stack;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-04-01.
 * @time 23:01
 */
public class InterviewQuestion9 {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    public void appendTail(Integer item){
        in.push(item);
    }

    public Integer deleteHead(){
        if(out.size() == 0){
            if(in.size() == 0){
                System.out.println("请先添加元素再删除！");
                return null;
            }
            while (in.size() > 0){
                out.push(in.pop());
            }
        }
        Integer result = out.pop();
        return result;
    }

    public static void main(String[] args) {
        InterviewQuestion9 interviewQuestion9 = new InterviewQuestion9();
        interviewQuestion9.appendTail(1);
        System.out.println(interviewQuestion9.deleteHead());
        System.out.println(interviewQuestion9.deleteHead());
    }
}
