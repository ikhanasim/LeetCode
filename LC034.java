


//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=study-plan-v2&envId=top-interview-150
import java.util.Arrays;
public class LC034 {
    public static void main(String[] args){
    int[] nums= {1,2,2,2,2,4};
    int target=2;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        result[0] = FirstRange(nums,target);
        result[1] = SecondRange(nums,target);
        return result;
    }
    public static int FirstRange(int[] nums ,int target){
        int start=0;
        int end=nums.length-1;
        int first=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid] == target ){
                first=mid;
                end=mid-1;
            }
            else if(nums[mid] < target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return first;
    }
    public static int SecondRange(int[] nums , int target){
        int start=0;
        int end=nums.length-1;
        int last=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid] == target ){
                last=mid;
                start=mid+1;
            }
           else if(nums[mid] < target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return last;
    }
}
