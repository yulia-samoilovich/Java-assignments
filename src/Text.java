public class Text implements Drawable
{
    String msg;
    public Text(String msg){
        this.msg = msg;
    }

    @Override
    public void draw() {
        System.out.println(msg);
    }
}
