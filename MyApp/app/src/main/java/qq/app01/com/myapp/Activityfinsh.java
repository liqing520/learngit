package qq.app01.com.myapp;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/9.
 */
public class Activityfinsh {
    //所有的ACtivity的集合
    private static List<Activity> list = new ArrayList<>();
    //添加
public  static void   addActivity(Activity activity){
    list.add(activity);
}
    //移除
    /*public static void  removeActivity(Activity activity){
        list.remove(activity);
}*/
    //结束进程
    public  static void finshAll(){
        for (Activity activity:list){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
