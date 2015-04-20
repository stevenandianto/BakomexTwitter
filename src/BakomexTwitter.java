

import java.util.Scanner;

/**
 * Created by user on 20/04/2015.
 */

public class BakomexTwitter {
    public static void main (String args[]){
        String Category;
        InputOutput IO = new InputOutput();
        Scanner scan = new Scanner(System.in);
        System.out.println("Category 1");
        Category = scan.nextLine();
        switch (Category){
            case "Olahraga":
                    System.out.println("Category ="+ Category);
                    System.out.println("Category 2");
                    System.out.println("Sepak Bola =");
                    IO.InputProcessor();
                    System.out.println("Bola Basket =");
                    IO.InputProcessor();
                    System.out.println("Renang =");
                    IO.InputProcessor();
                    break;
            case "Entertainment":
                    System.out.println ("Category ="+ Category);
                    System.out.println("Category 2");
                    break;
            case "Travelling":
                    System.out.println("Category ="+ Category);
                    System.out.println("Category 2");
                    break;
            case "Movie":
                    System.out.println("Category ="+ Category);
                    System.out.println("Category 2");
                    break;
            default:
                    break;
        }

    }
};
