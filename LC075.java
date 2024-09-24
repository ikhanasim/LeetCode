
//    https://leetcode.com/problems/sort-colors/description/
//    BUBBLE SORT
import java.util.Arrays;
public class LC075 {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        BubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void BubbleSort(int[] arr){
        boolean swap;
        for(int i=0; i<arr.length ;i++){
            swap=false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }if(!swap){
                break;
            }
        }
    }
}
