public class Tree implements Drawable
{
    int height;
    public Tree(int height){
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {

                for (int k = 0; k < height - j; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < ((2 * j) - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

