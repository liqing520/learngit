package qq.app01.com.myapp;

/**
 * Created by Administrator on 2016/8/8.
 */
public class item1 {
    //菜单
    private  String cd;
    //图片
    private  int image;

    public item1(String cd, int image) {
        this.cd = cd;
        this.image = image;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
