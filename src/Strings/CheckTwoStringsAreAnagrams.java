package Strings;

public class CheckTwoStringsAreAnagrams {
    static boolean CheckAnagram(String str1, String str2){
        int count =0;
        if(str1.length()!=str2.length()){
            return false;
        }
        else {
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        count++;
                    }
                }
            }
            if(count==str1.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="abcd";
        String str2="bacd";
        if(CheckAnagram(str1,str2)){
            System.out.println("The given strings are Anagrams");
        }
        else System.out.println("The given strings are not Anagrams");
    }
}
