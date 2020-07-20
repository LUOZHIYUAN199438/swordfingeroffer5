package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-04-02.
 * @time 16:51
 */
public class InterviewQuestion11 {
    public int getMinInArr(int[] arr){
       if(arr == null || arr.length == 0){
           throw new RuntimeException("Invalid parameters!");
       }
       int left = 0;
       int right = arr.length - 1;
       int mid = left;
       while (arr[left] >= arr[right]){
           if(right - left == 1){
               mid = right;
               break;
           }

           mid = left + (right - left) / 2;
           // 如果下标为left，right和mid指向的三个数字相等，则只能顺序查找
           if (arr[left] == arr[right] && arr[mid] == arr[left]){
                return minInOrder(arr,left,right);
           }

           if(arr[mid] >= arr[left]){
               left = mid;
           }else if(arr[mid] <= arr[right]){
               right = mid;
           }
       }
       return arr[mid];
    }

    public int minInOrder(int[] arr,int left,int right){
        int result = arr[left];
        for(int i = left + 1;i <= right;i ++){
            if (result > arr[i]){
                result = arr[i];
            }
        }
        return result;
    }
}
