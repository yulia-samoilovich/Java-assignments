import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do{
            try{
                getPositiveInteger();
            } catch (InvalidInputException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }while(true);
    }
    public static void getPositiveInteger() throws InvalidInputException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num < 0) {
                throw new InvalidInputException("Integer must be positive.");
            }
        }else if(scanner.hasNextFloat()){
            float num = scanner.nextFloat();
            throw new InvalidInputException("Input was a decimal number, was expecting an integer.");
        }else{
            throw new InvalidInputException("The given input was not an integer.");
        }
    }
}