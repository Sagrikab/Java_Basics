package com.stringexample;

import java.util.Arrays;

public class IsomorphicStrings {
    public static boolean isomorphic(String s,String t){
      int mappingDictSToT[]=new int[256];
      int mappingDictTToS[]=new int[256];

        Arrays.fill(mappingDictSToT,-1);
        Arrays.fill(mappingDictTToS,-1);
      for(int i=0;i<s.length();i++){
          char c1=s.charAt(i);
          char c2=t.charAt(i);

          if(mappingDictSToT[c1]==-1 && mappingDictTToS[c2]==-1){
              mappingDictSToT[c1]=c2;
              mappingDictTToS[c2]=c1;
          }
          else if(!(mappingDictSToT[c1]==c2 && mappingDictTToS[c2]==c1)){
              return false;
          }

      }

      return true;

    }
    public static void main(String[] args) {
     String s="foo";
     String t="bar";
        System.out.println(isomorphic(s,t));
    }
}
