// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/


public class LC852 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8};
        System.out.println(MountainArray(arr));
    }static int MountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
            }return start;
        }
    }


