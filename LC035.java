
// https://leetcode.com/problems/search-insert-position/description/?envType=study-plan-v2&envId=top-interview-150


public class LC035 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,20,100};
        int target=99;
        int result=SearchInsertPosition(arr,target);
        System.out.println(result);
    }static int SearchInsertPosition(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid] < target){
                start=mid+1;
            }
            else if(arr[mid] > target){
                end=mid-1;
            }else{
                return mid;
            }
        }return end+1;
    }
}
