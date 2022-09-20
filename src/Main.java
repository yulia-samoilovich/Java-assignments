public class Main
{
    public static void main(String[] args)
    {
        Drawable circle = new Circle(3);
        Drawable square = new Square(3);
        Drawable tree = new Tree(3);
        Drawable text = new Text("Print this message");

        circle.draw();
        square.draw();
        tree.draw();
        text.draw();

    }
}
