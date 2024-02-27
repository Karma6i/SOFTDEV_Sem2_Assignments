import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> myList = 
        List.of("GOV", "WEBDEV", "TRIG", "SOFTDEV", "LUNCH", "STUDY", "ENGLISH", "METEOROLOGY");

        class Final{
            Final(<String, String>toLowerCase){

            String lowerCasedList = (s) -> s.toLowerCase();
            System.out.println(lowerCaseSchedule);

        }

        String StringlowerCaseSchedule = myList.stream().map(toLowerCase).toList();
        String lowerCaseSchedule = (s) -> s.toLowerCase();
        }

        

        //create  a list of strings.  
        //fill that list with your daily school schedule
        //write a Function<String, String> toLowerCase
        //the function will equal (s) -> s.toLowerCase();
        //map your list of strings to another list of strings using 
        //.stream().map(toLowerCase).toList(); and set to a variable called lowerCaseSchedule
        //System.out.println(your lower cased list)


    }
}
