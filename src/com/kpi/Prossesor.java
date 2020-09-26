package com.kpi;

public class Prossesor {

    public static void prosses(Task task, int timeForProsses){
        try {
            Thread.sleep(timeForProsses);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.setTime(task.getTime() - timeForProsses);
    }

}
