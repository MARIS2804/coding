//Remove Duplicates from Sorted Array - Leetcode-26  - Easy
//Remove duplicates from a sorted array in-place such that each element appears only once and return the new length.

import java.util.Arrays;

public class RemoveDu{
    public static int remove(int[] num){
        if(num.length==0){
            return 0;
        }
        int l=0;
        int r=l+1;
        while(r<num.length){
            if(num[l]!=num[r]){
                num[++l]=num[r];
            }
            else{
                r++;
            }
        }
        for(int i=l+1;i<num.length;i++){
            num[i]=-99;
        }

        System.out.println(Arrays.toString(num));

        return l+1;
    }
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5};
        int res=remove(a);
        System.out.println(res);
    }
}