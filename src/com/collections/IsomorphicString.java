package com.collections;

import java.util.HashMap;

public class IsomorphicString {

    public static String transformString(String s){

        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c1 = s.charAt(i);
            if (!(map.containsKey(c1))) {
                map.put(c1, i);
            }
            sb.append(Integer.toString(map.get(c1)));
            sb.append(" ");
        }
        return sb.toString();
    }
    public static boolean isIsmorphic(String s,String t){
        return transformString(s).equals(transformString(t));
    }
    public static void main(String[] args) {
        String s="foo";
        String t="bar";
        System.out.println(isIsmorphic(s,t));
    }
}
