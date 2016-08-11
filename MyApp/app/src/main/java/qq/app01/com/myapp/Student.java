package qq.app01.com.myapp;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/9.
 */
public class Student implements Serializable{
    private String studentName;
    private int sex;
    private  int age;

    public Student( int age, int sex, String studentName) {

        this.age = age;
        this.sex = sex;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
