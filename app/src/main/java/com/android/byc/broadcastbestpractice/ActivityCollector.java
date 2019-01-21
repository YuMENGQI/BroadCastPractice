package com.android.byc.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/14 16:47
 * @description
 */
public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<>();
    public static  void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
