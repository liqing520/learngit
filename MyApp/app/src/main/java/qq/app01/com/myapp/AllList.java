package qq.app01.com.myapp;

import android.content.Intent;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/8.
 */
public class AllList {

    public static List<item1> getOneList() {
        List<item1> listOne = new ArrayList<>();
        item1 tem1 = new item1("选修课程", R.drawable.xxkc);
        item1 tem2 = new item1("课程信息", R.drawable.kcxx);
        item1 tem3 = new item1("查询学生信息", R.drawable.xsxx);
        item1 tem4 = new item1("课程详细信息", R.drawable.xxkcxx);
        item1 tem5 = new item1("帮助", R.drawable.bz);
        item1 tem6 = new item1("退出系统", R.drawable.tcxt);
        listOne.add(tem1);
        listOne.add(tem2);
        listOne.add(tem3);
        listOne.add(tem4);
        listOne.add(tem5);
        listOne.add(tem6);
        return listOne;
    }

    public static List<CouesrMode> getKCList() {
        List<CouesrMode> list = new ArrayList<>();

        Student student=new Student(16,1,"张涛");
        Student student1=new Student(17,0,"明宇");
        Student student2=new Student(17,0,"李红");
        Student student3=new Student(16,0,"张骄");
        Student student4=new Student(18,1,"张东方");
        Student student5=new Student(16,1,"洪福");
   //学生选修课程的集合
        List<Student> math= new ArrayList<>();
        math.add(student);
        math.add(student1);
        List<Student> hostiry= new ArrayList<>();
        hostiry.add(student2);
        hostiry.add(student3);
        hostiry.add(student5);
        List<Student> zz= new ArrayList<>();
        zz.add(student);
        zz.add(student1);
        zz.add(student2);
        zz.add(student3);
        zz.add(student4);
        List<Student> english= new ArrayList<>();
        english.add(student);
        //课程的集合
        return list;
    }

    public static List<String> getKCBH() {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= getKCList().size(); i++) {
            list.add("000" + i);
        }
        return list;
    }
}
