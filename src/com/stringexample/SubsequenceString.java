package com.stringexample;

public class SubsequenceString {
    public static boolean isSubsequence(String s,String t){
      int j=0;
      if(s==null) return false;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)) j++;
            if(j==s.length()) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
