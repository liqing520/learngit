package qq.app01.com.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;
import java.util.TooManyListenersException;

public class MainCXXSXX extends AppCompatActivity {
    CourserApplication courserApplication;
    String couser = "";
    EditText editText;
    Button button;
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cxxsxx);
        Activityfinsh.addActivity(this);
        courserApplication = (CourserApplication) getApplication();
        editText = (EditText) findViewById(R.id.cxedit);
        button = (Button) findViewById(R.id.cxbut);
        ImageView imageView = (ImageView) findViewById(R.id.fanhui);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainCXXSXX.this, MainActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strName = editText.getText().toString();
                Intent intent = new Intent(MainCXXSXX.this, MainCXJG.class);
                if (getStudent(strName)==null&&getStudent1(strName)==null){
                    Toast.makeText(MainCXXSXX.this,"没有此学生",Toast.LENGTH_SHORT).show();
                }else if (getStudent(strName)!=null){
                    intent.putExtra("Student",getStudent(strName) );
                    intent.putExtra("courseName",couser);
                    startActivity(intent);
                } else {
                    intent.putExtra("Student",getStudent1(strName) );
                    intent.putExtra("courseName",couser);
                    startActivity(intent);
                }
            }
        });
    }

    public Student getStudent(String name) {

        for (int i = 0; i < courserApplication.getCouesrModeList().size(); i++) {
            for (int j = 0; j < courserApplication.getCouesrModeList().get(i).getStudent().size(); j++) {
                if (courserApplication.getCouesrModeList().get(i).getStudent().get(j).getStudentName().equals(name)) {
                    student = courserApplication.getCouesrModeList().get(i).getStudent().get(j);
                    couser += courserApplication.getCouesrModeList().get(i).getCoueserName() + "\t";
                }

            }
        }
        return student;
    }

    public Student getStudent1(String name) {
        Student student = null;
        couser=null;
        for (int i = 0; i < courserApplication.getStudents().size(); i++) {
            if (courserApplication.getStudents().get(i).getStudentName().equals(name)) {
                student = courserApplication.getStudents().get(i);
            }
        }
        return student;
    }

    ;
}
