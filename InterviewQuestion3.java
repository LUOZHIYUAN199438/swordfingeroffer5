package swordfingeroffer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-03-25.
 * @time 1:43
 */
public class InterviewQuestion3 {
    public Integer findDuplicateInArray(int[] array){
        // 对参数进行判断
        if (array == null || array.length == 0){
            return null;
        }

        for(int i = 0;i < array.length;i ++){
            if (array[i] < 0 || array[i] > array.length - 1){
                return null;
            }
        }

        for(int i = 0;i < array.length;i ++){
            while (array[i] != i){
                int num = array[i];
                if(array[num] == num){
                    return num;
                }
                array[i] = array[num];
                array[num] = num;
            }
        }
        return null;
    }

    public Integer findDuplicateInArray2(int[] array){
        // 数组为空或者数组没有元素
        if (array == null || array.length == 0){
            return null;
        }

        // 数组长度
        int arrLen = array.length;

        // 数组有元素但是元素的值不符合要求,数组的值要求在（1~n）
        for (int i = 0;i < arrLen;i ++){
            if (array[i] <= 0 || array[i] >= arrLen){
                return null;
            }
        }

        // 用辅助数组
        int[] helpArr = new int[arrLen];

        // 遍历原数组的每一个元素，将该元素的值作为辅助数组的下标，查看以该下标的辅助数组的值是否为0，不为0说明重复，否则将值写入辅助数组。
        for (int i = 0;i < arrLen;i ++){
            int arrValue = array[i];
            if (helpArr[arrValue] != 0){
                return arrValue;
            }
            helpArr[arrValue] = arrValue;
        }

        return null;
    }



    public static void mian(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int arrSize = scan.nextInt();
            int[] arr = new int[arrSize];
            for(int i = 0;i < arrSize;i ++){
                arr[i] = scan.nextInt();
            }
            // 数组排序
            Arrays.sort(arr);
            // 输出前面数字，后面有相同的就不用输出了
            for(int i = 0;i < arr.length;i ++){
                if(i == 0 || arr[i] != arr[i - 1]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
