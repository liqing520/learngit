package qq.app01.com.myapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainXXKC extends AppCompatActivity {
    CourserApplication courserApplication;
    Button button;
    EditText editTextName;
    EditText editTextage;
    RadioButton radioButton;
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_xxkc);
        Activityfinsh.addActivity(this);
        courserApplication = (CourserApplication) getApplication();
        button = (Button) findViewById(R.id.xxbut);
        ImageView imageView = (ImageView) findViewById(R.id.fanhui);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainXXKC.this, MainActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getStudent() == null) {
                    Toast.makeText(MainXXKC.this, "姓名或者年龄不能为空", Toast.LENGTH_SHORT).show();
                } else {
                    getStudent1();
                    Intent intent = new Intent(MainXXKC.this, MainXXKCYM.class);
                    intent.putExtra("Student", getStudent());
                    startActivity(intent);
                }
            }
        });
    }

    //获取学生对象
    public Student getStudent() {
        editTextName = (EditText) findViewById(R.id.xxedit);
        editTextage = (EditText) findViewById(R.id.xxedit2);
        radioButton = (RadioButton) findViewById(R.id.rid);
        int sex = 0;//默认是男孩
        if (radioButton.isChecked()) {
            sex = 0;
        } else {
            sex = 1;
        }
        int age = 0;
        String a = editTextage.getText().toString().trim();
        if ("".equals(a)) {
            age = 0;
        } else {
            try {
                age = Integer.valueOf(editTextage.getText().toString());
            } catch (NumberFormatException e) {
                age = 0;
            }
        }
        String name = editTextName.getText().toString().trim();
        if (age == 0 || name.equals("")) {
            return null;
        }
        student = new Student(age, sex, name);

        return student;
    }

    public boolean getStudent1() {

        for (int i = 0; i < courserApplication.getStudents().size(); i++) {
            if (courserApplication.getStudents().get(i).getStudentName().equals(getStudent().getStudentName())) {
                return false;
            }
        }
        courserApplication.getStudents().add(getStudent());
        return true;
    }
}
