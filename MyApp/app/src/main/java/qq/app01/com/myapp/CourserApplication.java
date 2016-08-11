package qq.app01.com.myapp;

import android.app.Application;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/10.
 */
public class CourserApplication extends Application {
    List<CouesrMode> couesrModeList = new ArrayList<CouesrMode>();
    List<Student> students = new ArrayList<>();
    @Override
    public void onCreate() {
        super.onCreate();
        CouesrMode couesrMode = new CouesrMode("0001", "数学", new Teacher("张明", "数学"), new ArrayList<Student>());
        CouesrMode couesrMode1 = new CouesrMode("0002", "历史", new Teacher("宏达", "历史"), new ArrayList<Student>());
        CouesrMode couesrMode2 = new CouesrMode("0003", "政治", new Teacher("张海鸥", "政治"), new ArrayList<Student>());
        CouesrMode couesrMode3 = new CouesrMode("0004", "英语", new Teacher("李青峰", "英语"), new ArrayList<Student>());

        couesrModeList.add(couesrMode);
        couesrModeList.add(couesrMode1);
        couesrModeList.add(couesrMode2);
        couesrModeList.add(couesrMode3);
    }

    public List<CouesrMode> getCouesrModeList() {
        return couesrModeList;
    }

    public void setCouesrModeList(List<CouesrMode> couesrModeList) {
        this.couesrModeList = couesrModeList;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
