package com.leet_code;

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Recent_Calls {
    Queue<Integer> queue;
    public void RecentCounter() {
        queue=new LinkedList<>();
    }

    public int ping(int t) {
        if(queue.size()==0){
            queue.add(t);
            return 1;
        }else{
            if(t<=3000){
                queue.add(t);
            }else{int m=t-3000;
                while(queue.size()!=0&& queue.peek()<m){
                    queue.poll();
                }queue.add(t);
            }return queue.size();
        }
    }
}
