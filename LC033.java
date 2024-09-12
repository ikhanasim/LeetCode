

//  https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class LC033 {
    public static void main(String[] args) {
          int[] nums={5,6,7,8,10,1,2,3,4};
   //     int[] nums={0,1,2,3,4,5,6,7,8,9};
        int target=3;
        System.out.println(search(nums, target));
    }
    static int search(int[] nums, int target){
        int pivot=PivotSearch(nums);
        if(pivot == -1){
            return BinarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target>=nums[0] ){
            return BinarySearch(nums,target,0,pivot-1);
        }
        else{
            return BinarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    static int BinarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > nums[mid]){
                start = mid+1;
            }else if (target < nums[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int PivotSearch(int[] nums ) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ( mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid- 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}













  /*
    static int search(int[] nums,int target){
        int start=0;
        if(target>nums[start]){
            int end=SeachPivot(nums)-1;
            if(SeachPivot(nums)==target){
                return SeachPivot(nums);
            }
            while(start<end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }return -1;
        }
        else{
            start=SeachPivot(nums)-1;
            int end=nums.length-1;
            while(start<end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }return -1;
        }
    }
    static int SeachPivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }return -1;
    }
}
*/