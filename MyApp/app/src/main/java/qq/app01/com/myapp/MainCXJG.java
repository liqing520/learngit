package qq.app01.com.myapp;

import android.content.Intent;
import android.support.v4.content.Loader;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainCXJG extends AppCompatActivity {
    Intent intent;
    CourserApplication courserApplication;
    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    Student student;
    String cou = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cxjg);
        Activityfinsh.addActivity(this);
        courserApplication = (CourserApplication) getApplication();
        ImageView imageView = (ImageView) findViewById(R.id.fanhui);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainCXJG.this, MainCXXSXX.class);
                startActivity(intent);
            }
        });
        textView = (TextView) findViewById(R.id.jg1);
        textView1 = (TextView) findViewById(R.id.jg2);
        textView2 = (TextView) findViewById(R.id.jg3);
        textView3 = (TextView) findViewById(R.id.jg4);
        intent = getIntent();
        String cou = intent.getStringExtra("courseName");
        student=(Student) intent.getSerializableExtra("Student");

        textView.setText("姓名为:" + student.getStudentName());
        int sex = student.getSex();
        String sxe = null;
        if (sex == 0) {
            sxe = "男";
        } else {
            sxe = "女";
        }
        textView1.setText("性别为：" + sxe);
        textView2.setText("年龄为：" + student.getAge());
        if (cou==null) {
            cou = "没有选择任何课程";
        }
        textView3.setText("选修课程为：" + cou);
    }
}
