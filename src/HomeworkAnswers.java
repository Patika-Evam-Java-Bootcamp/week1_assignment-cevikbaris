import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkAnswers {

    static String variable= "code";

    //check the string array
    public static String checkStringArray (String [] params){
        for(String param : params){
            if(param.contains(variable))
                return "Tanımlı value'yu içeren string değer: " + param;
        }
        return "Tanımlı value'yi içermiyor ";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//get input from user
        List<String> inputList = new ArrayList<>();//create array list for inputs
        for(int i=0 ; i<5 ; i++){
            System.out.println("Enter a string and check it ");//get 5 times scanner input
            inputList.add(scanner.nextLine());//add input to arrayList
        }

        //check each input
        System.out.println(checkStringArray(inputList.toArray(new String[4])));

    }
}
