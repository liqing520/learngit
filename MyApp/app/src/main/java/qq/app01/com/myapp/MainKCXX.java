package qq.app01.com.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainKCXX extends AppCompatActivity {
    CourserApplication courserApplication;

    ListView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kcxx);
        Activityfinsh.addActivity(this);
        courserApplication = (CourserApplication) getApplication();
        ImageView imageView = (ImageView) findViewById(R.id.fanhui);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainKCXX.this,MainActivity.class);
                startActivity(intent);
            }
        });
        gridView = (ListView) findViewById(R.id.kcgrid);
        BaseAdapter baseAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return courserApplication.getCouesrModeList().size();
            }

            @Override
            public Object getItem(int i) {
                return i;
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view1 = View.inflate(MainKCXX.this, R.layout.activekc, null);
                TextView textView = (TextView) view1.findViewById(R.id.kcBH);
                TextView textView1 = (TextView) view1.findViewById(R.id.kcNAME);
                TextView textView2 = (TextView) view1.findViewById(R.id.kcTeacher);
                TextView textView3 = (TextView) view1.findViewById(R.id.kcNumber);
                textView.setText(courserApplication.couesrModeList.get(i).getCoueserNO());
                textView1.setText(courserApplication.couesrModeList.get(i).getCoueserName());
                textView2.setText(courserApplication.couesrModeList.get(i).getTeacher().getTeacherName());
                textView3.setText(String.valueOf(courserApplication.couesrModeList.get(i).getStudent().size()));
                textView.setTextColor(getResources().getColor(R.color.lan));
                return view1;
            }
        };
        gridView.setAdapter(baseAdapter);
    }
}