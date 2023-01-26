package com.collections;

import java.util.*;

public class StudentExampleCollectionListsOfLists {

    public static void main(String[] args) {
        List<Map<String,String>> listOfStu=new ArrayList<>();

        Map<String,String> map=new HashMap<>();

        map.put("A","Computer");
        map.put("B","ENTC");
        map.put("C","Civil");
        map.put("D","Mechanical");
        map.put("E","Electrical");

//        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,String> entry=iterator.next();
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
        listOfStu.add(map);
        listOfStu.forEach(System.out::println);

       // List<String> ListOfKeys=null;

//        ListOfKeys=map.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(ListOfKeys);
        Scanner sc=new Scanner(System.in);
        String getValue=sc.next();
        for(Map<String,String> Value:listOfStu){
            if(map.containsKey(getValue)){
                System.out.println(Value.get(getValue));
            }
        }
        String key=sc.next();
        String value=sc.next();
        for(Map<String,String> val:listOfStu){
            try {
                if (!(map.containsKey(key))) {
                    val.put(key, value);

                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
        listOfStu.forEach(System.out::println);
        String elementTobeRemoved=sc.next();
        listOfStu.remove(map.remove(elementTobeRemoved));
        listOfStu.forEach(System.out::println);

    }

}
