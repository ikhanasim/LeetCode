
//     https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

import java.util.Scanner;
public class LC1281 {
    public static void main(String[] args){
            Scanner input=new Scanner (System.in);
            System.out.print("enter a number: ");
            int num=input.nextInt();
            System.out.print(subtractProductAndSum(num));
        }
        public static int subtractProductAndSum(int num){
            int temp1=num;
            int temp2=num;
            int sum =0;
            int product=1;
            int res=0;
            while(temp1 >0){
                int rem=temp1%10;
                sum +=rem;
                temp1=temp1/10;
            }
            while(temp2>0){
                int rem=temp2%10;
                product=product*rem;
                temp2=temp2/10;
            }
            res=product- sum;
            return res;
        }
}


