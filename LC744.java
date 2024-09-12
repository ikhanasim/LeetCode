
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/


public class LC744 {
    public static void main(String[] args){
        char[] letters={'c','f','j','k' , 'l' };
        char target='k';
        char res=nextGreatestLetter(letters,target);
        System.out.println(res);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return letters[start % letters.length];
    }
}

