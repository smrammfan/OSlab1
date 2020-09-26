package com.kpi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Scheduler {
    private final List<Task> firstQueue;
    private final List<Task> secondQueue;
    private final List<Task> thirdQueue;

    public Scheduler(){
        firstQueue = new LinkedList<>();
        secondQueue = new LinkedList<>();
        thirdQueue = new ArrayList<>();
    }

    public void start(Task[] tasks){
        for (Task task : tasks) {

        }
    }



}
