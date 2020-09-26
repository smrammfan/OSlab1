package com.kpi;

import java.util.Random;
import java.util.stream.IntStream;


public class TaskGenerator {
    public static final int MIN_TIME = 10;

    public static Task[] generateRandomTasks(int count, int maxTime, int arriveTime){
        return (Task[]) IntStream
                .rangeClosed(1, count)
                .mapToObj(i -> generateRandomTask(i, new Random().nextInt(maxTime + 1) + MIN_TIME))
                .toArray();
    }

    public static Task generateRandomTask(int id, int time){
        if(time < MIN_TIME) throw new Error(String.format("Time for task[id:%d] is smaller than min time.", id));
        return new Task(id, time);
    }
}
