package swordfingeroffer;

import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            Stack<String> stack = new Stack<String>();
            int result = 0;
            int tempNum = 0;
            for(int i = 0;i < str.length();i ++){
                char c = str.charAt(i);
                if(c == '('){
                    if(stack.isEmpty()){
                        tempNum = 0;
                    }
                    stack.push(c + "");
                }else if(c == ')'){
                    if(stack.isEmpty()){
                        continue;
                    }
                    stack.pop();
                    tempNum += 2;
                    result = (result > tempNum) ? result : tempNum;
                }else {
                    stack.clear();
                }
            }
            System.out.println(result);
        }
    }
}