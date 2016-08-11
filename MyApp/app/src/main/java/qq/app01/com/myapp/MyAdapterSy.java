package qq.app01.com.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/8/8.
 */
public class MyAdapterSy extends BaseAdapter{
    public List<item1> list;
    public Context mainActivity;

    public MyAdapterSy(List<item1> list, MainActivity mainActivity) {
        this.list = list;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View view1=View.inflate(mainActivity,R.layout.activesy,null);
        ImageView imageView= (ImageView) view1.findViewById(R.id.img0);
        imageView.setImageResource(list.get(i).getImage());
        TextView textView= (TextView) view1.findViewById(R.id.text1);
        textView.setText(list.get(i).getCd());

        return  view1;
    }
}
