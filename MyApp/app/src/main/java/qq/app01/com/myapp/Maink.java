package qq.app01.com.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Maink extends AppCompatActivity {
TextView textView;
    TextView textView1;
    Intent intent;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maink);
        Activityfinsh.addActivity(this);
        textView = (TextView) findViewById(R.id.kkte);
        textView1 = (TextView) findViewById(R.id.kkte2);
        ImageView imageView = (ImageView) findViewById(R.id.fanhui);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Maink.this,MainKCXXXX.class);
                startActivity(intent);
            }
        });
        intent = getIntent();
       String number = intent.getStringExtra("num");
        String numbers = String.valueOf((20 - Integer.valueOf(number)));
        if (number.equals("20")){
            number="已满";
        }
        textView.setText("课程选择数："+number);
        textView1.setText("课程未选择数："+numbers);
    }
}
