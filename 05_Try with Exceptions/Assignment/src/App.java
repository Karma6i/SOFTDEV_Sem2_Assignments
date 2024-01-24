import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        try(Scanner input = new Scanner(System.in)){ 

        System.out.println("Enter a number: ");
        String number1 = input.next();

        System.out.println("Enter aother number: ");
        String number2 = input.next();

        int number1Int = 0;
        int number2Int = 0;

        }

        try{
            try{
                int number1Int = Integer.parseInt(number1);
            }catch(Exception ex){
                number1Int = 0;
                throw new IntegerException("Number 1 is not an integer");
            }
            try{
                number2Int = Integer.parseInt(number2);
            }catch(Exception ex){
                number2Int = 0;
                throw new IntegerException("Number 2 is not an integer");
            }

        }catch(IntegerException intEX){
        number1Int = 0;
        System.out.println(intEX.getMessage());
        }
        System.out.println(number1Int * number2Int);
}
}
// Think I already finished this but it had weird unknonwn issues? Not sure
