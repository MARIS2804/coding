//Valid Palindrome - Leetcode-125 - Easy
//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

public class ValidPalindrome{
    public static boolean palindrome(String str){
        str=str.replaceAll("[^a-zA-Z0-9]","");
        str=str.toLowerCase();
        System.out.println("String="+str);
        int l=0;
        int r=str.length()-1;
        int flag=0;
        while((l<r)&&(flag!=1)){
            if(str.charAt(l)!=str.charAt(r)){
                flag=1;
            }
            else{
                flag=0;
            }
            l++;
            r--;
        }
        if(flag==1){
        return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args){
        System.out.println(palindrome( "aba"));
        
    }
}