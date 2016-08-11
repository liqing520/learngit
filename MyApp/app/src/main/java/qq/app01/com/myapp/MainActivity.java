package qq.app01.com.myapp;

import android.content.Intent;
import android.support.v4.content.pm.ActivityInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    BaseAdapter baseAdapter;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Activityfinsh.addActivity(this);
        listView = (ListView) findViewById(R.id.listview);
        baseAdapter = new MyAdapterSy(AllList.getOneList(), MainActivity.this);
        listView.setAdapter(baseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    intent = new Intent(MainActivity.this, MainXXKC.class);
                } else if (i == 1) {
                    intent = new Intent(MainActivity.this, MainKCXX.class);
                } else if (i == 2) {
                    intent = new Intent(MainActivity.this, MainCXXSXX.class);
                } else if (i == 3) {
                    intent = new Intent(MainActivity.this, MainKCXXXX.class);
                } else if (i == 4) {
                    intent = new Intent(MainActivity.this, MainBZ.class);
                } else if (i == 5) {
                    intent = new Intent(MainActivity.this, MainTCXT.class);
                }
                startActivity(intent);
            }
        });
    }
}
