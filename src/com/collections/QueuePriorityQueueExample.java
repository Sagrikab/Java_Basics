package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue=new PriorityQueue<>();

        priorityQueue.add("Breaking Bad");
        priorityQueue.add("GOT");
        priorityQueue.add("Friends");
        priorityQueue.add("HYMYM");
        priorityQueue.add("SuperNaturals");
        System.out.println(priorityQueue);
        System.out.println("Head: "+priorityQueue.peek());
        System.out.println("Head removed: "+priorityQueue.poll());
        System.out.println(priorityQueue);

        Iterator<String> iterator=priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.contains("HYMYM"));

    }
}
