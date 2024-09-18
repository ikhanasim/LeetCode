

//     https://leetcode.com/problems/search-a-2d-matrix/description/?envType=study-plan-v2&envId=top-interview-150
///
import java.util.Arrays;
public class LC074 {
    public static void main(String[] args){
        int[][] arr={
                {1,3,5,7},
                {2,6,9,11}
        };
        System.out.println(Arrays.toString(ArraySearch2D(arr,7)));
    }
    public static int[] ArraySearch2D(int[][] arr, int target){
        int row=0;
        int col=arr[row].length-1;
        while(row < arr[row].length && col>=0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            if(arr[row][col]  <  target){
                row ++;
            }else
                col--;
        }
        return new int[]{-1,-1};
    }
}
