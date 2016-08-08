/**
 * Created by Администратор on 08.08.16.
 */
import java.util.Scanner;

public class InteractRunner{
    private static Calculator calc;

    /*String variable that uses to get the result from previous operation and make it an argument in current calculation*/
    private final static String previousResult = "r";

    /*Dialog with user in console, get two integer numbers and one sign of operation as input and gave the result of calculation as output*/
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        try{
            calc = new Calculator();
            String exit = "n";
            while(!exit.equals("y")){
                System.out.println("Type \""+previousResult+"\" to use result from previous calculation");

                System.out.println("Enter first arg: ");
                String firstArg =reader.next();

                System.out.println("Choose operation(+-*/): ");
                char operation = reader.next().charAt(0);

                System.out.println("Enter second arg: ");
                String secondArg =reader.next();

                try{
                    calc.calculate(getArgument(firstArg), getArgument(secondArg), operation);
                    System.out.println("Result: " + calc.getResult());}
                catch(NumberFormatException e){
                    System.err.println("Wrong number");
                }

                System.out.println("Exit : y/n ");
                exit = reader.next();


            }

        }finally{reader.close();}
    }
    /*Convert String argument from scanner to Integer or retrieve previous result if asked*/
    private static int getArgument(String scanLine) throws NumberFormatException{
        int argument =0;
        if(scanLine.equals(previousResult)){
            argument=calc.getResult();
        }
        else{
            argument=Integer.valueOf(scanLine);
        }

        return argument;
    }

}