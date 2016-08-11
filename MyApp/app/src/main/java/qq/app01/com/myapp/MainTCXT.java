package qq.app01.com.myapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainTCXT extends AppCompatActivity {
    Button buttonY;
    Button buttonN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activityfinsh.addActivity(this);
        setContentView(R.layout.activity_main_tcxt);
        buttonY = (Button) findViewById(R.id.tctxt2);
        buttonN = (Button) findViewById(R.id.tctxt3);
        ImageView imageView = (ImageView) findViewById(R.id.fanhui);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainTCXT.this,MainActivity.class);
                startActivity(intent);
            }
        });
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainTCXT.this,MainActivity.class);
            }
        });
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainTCXT.this)
                        .setTitle("你真的要关闭我吗？？？").setMessage("你真的那么狠心吗")
                        .setPositiveButton("是", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Activityfinsh.finshAll();
                            }
                        }).setNegativeButton("否", null).create().show();
            }
        });
    }
}
