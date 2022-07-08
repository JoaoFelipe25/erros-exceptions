package exceptions;

import java.util.ArrayList;
import java.util.Scanner;

class itemNotFoundException extends RuntimeException {
    

    public itemNotFoundException(String message) {
        super(message);
    }
}

public class ExceptionsExample02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();


        list.add("leite");
        list.add("pao");
        list.add("Manteiga");
        list.add("queijo");

        System.out.println("Informe o item buscado:");
        String item = scanner.nextLine();

        try {
            
            if(!list.contains(item)){
         
                throw new itemNotFoundException("Este item nao estao na lista");
            }else{
                System.out.println("Item encontrado");
            }

        } catch (itemNotFoundException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
 