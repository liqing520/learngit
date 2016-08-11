package qq.app01.com.myapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/9.
 */
public class CouesrMode {
    //课程编号
    private String coueserNO;
    //课程名称
    private String coueserName;
    //教师的姓名
    private Teacher teacher;
    //学生的人数
    private List<Student> students = new ArrayList<>();

    public CouesrMode() {
        super();
    }

    public CouesrMode(String coueserNO, String coueserName, Teacher teacher, List<Student> students) {
        this.coueserNO = coueserNO;
        this.coueserName = coueserName;
        this.teacher = teacher;
        this.students = students;
    }

    //添加学生选课信息
    //选课上线20人
    //不能重复选课
    public boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }
        //根据名字判断
        for (Student s : students) {
            if (s.getStudentName().equals(student.getStudentName())) {
                return false;
            }
        }
        //超过20人不能继续选择
        if (students.size() > 20) {
            return false;
        }
        students.add(student);
//添加数据
        return true;

    }


    public String getCoueserNO() {
        return coueserNO;
    }

    public void setCoueserNO(String coueserNO) {
        this.coueserNO = coueserNO;
    }

    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(List<Student> student) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCoueserName() {
        return coueserName;
    }

    public void setCoueserName(String coueserName) {
        this.coueserName = coueserName;
    }
}
