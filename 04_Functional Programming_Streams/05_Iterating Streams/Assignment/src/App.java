import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        // use streams to generate a list of numbers from 0 to 10
        List<Integer> ints = IntStream.rangeClosed(0, 10).boxed().toList();

        Function<Integer, Integer> add5 - num -> num + 5;
        List<Integer> numsPlus5 = numbers.stream().map(add5).toList; 
        System.out.println(numbers);
        System.out.println(numbersPlus5);

        // use streams and Functions with lambdas to make a list with 5 added to each numbers in the ints list
        // use streams and foreach to print out the values

        //What else you need to do.  
        //TODO:  repeate the mapping wtih an extra div2Function and map the list of intsPlus5 to make
        // a list intsPlus5Div2.  
        //TODO:  use foreach to print intsPlus5Div2

        //TODO:  acutally implement the lambda correctly

        //List<Integer> intsPlus5 = ints.stream().map(numbersPlus5).toList();

        //Consumer<Integer> intPrinter = (num) -> System.out.println(num);
        //intsPlus5.stream().forEach(intPrinter);

        //TODO:  write a div2Func Function like I did with add5Func (aka numsPlus5)
        //TODO:  apply div2Func to intsPlus5 with map
        //TODO:  print with foreach.  

        
    }
}
