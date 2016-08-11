package qq.app01.com.myapp;

/**
 * Created by Administrator on 2016/8/9.
 */
public class Teacher {

    private  String teacherName;
    private  String couesrName;

    public Teacher(String teacherName, String couesrName) {
        this.teacherName = teacherName;
        this.couesrName = couesrName;
    }

    public String getCouesrName() {
        return couesrName;
    }

    public void setCouesrName(String couesrName) {
        this.couesrName = couesrName;
    }


    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
