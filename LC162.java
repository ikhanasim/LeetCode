

// https://leetcode.com/problems/find-peak-element/description/

public class LC162 {
    public static void main(String[] args) {
        int[] nums = {1,2,6,5,4,3,1};
        System.out.println(PeakElement(nums));
    }static int PeakElement(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }return start;
    }
}
