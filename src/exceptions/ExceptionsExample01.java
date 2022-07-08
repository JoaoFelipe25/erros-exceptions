package exceptions;
import java.util.Scanner;

//Checked Exceptions

class AgeException extends Exception {

    public AgeException(String message) {

        super(message);
    }
}

public class ExceptionsExample01 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        Integer age = Integer.parseInt(scanner.nextLine());

        try {
            
            if (age < 18) {

                scanner.close();
                
                throw new AgeException("Idade de ser superior ou igual a 18");
            }else{
                System.out.println("Porde dirigir");
            }
        } catch (AgeException ae) {
            System.out.println(ae.getMessage());
        }

        scanner.close();
    }
}
