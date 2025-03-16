//Two sum II - Leetcode-167 - Easy
//Given a sorted array of integers and a target sum, find the indices of the two numbers that add up to the target.

import java.util.Arrays;

public class TwoSumSorted{
      public static int[] twosum(int[] list,int target){
              int r=0;
              for(int l=0;l<list.length;l++){
                  r=l+1;
                  while(r<list.length){
                      int sum=(list[l]+list[r]);
                       if(sum<target){
                          r++;
                       }
                       else if(sum>target){
                          break;
                       }
                       else{
                          int[] result={l+1,r+1};
                                 return result;
                       }
                       
                  }
      
              }
              
              int[] res1={-1};
              return res1;
            }
      
            public static void main(String[] args) {
                int[] list = {1, 2, 3, 4, 5};
                int target = 10;
              System.out.println("Result"+Arrays.toString(twosum(list,target)));
      }
}