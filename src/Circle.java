public class Circle extends Shape implements Drawable
{
    int radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }
    @Override
    public void draw()
    {
        int size = (2 * radius) + 1;
        int x, y;

        for(int i=0; i<size; i++){
            for (int j = 0; j < size; j++) {
                x=i-radius;
                y=j-radius;
                if(x*x + y*y <= size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
