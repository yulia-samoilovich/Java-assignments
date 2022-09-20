public class Square extends Shape implements Drawable
{
    int side;
    public Square(int side)
    {
        this.side = side;
    }
    @Override
    public void draw() {
        for(int i=0; i<side; i++){
            for(int j=0; j<side; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
