import java.util.Scanner;

/**
 * Created by user on 20/04/2015.
 */
public class InputOutput {
    public InputOutput() {
    }

    ;

    public void InputProcessor() {
        String str = "";
        char[] deleter;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        String[] strarray = str.split("\\,", -1);
        for (int i = 0; i < strarray.length; i++) {
            deleter = strarray[i].toCharArray();
            strarray[i] = "";
            if (deleter[0] == ' ') {
                if (deleter[deleter.length - 1] == ' ') {
                    for (int j = 1; j < deleter.length - 1; j++) {
                        strarray[i] += deleter[j];
                    }
                } else {
                    for (int j = 1; j < deleter.length; j++) {
                        strarray[i] += deleter[j];
                    }
                }

            } else if (deleter[deleter.length - 1] == ' ') {
                for (int j = 0; j < deleter.length - 1; j++) {
                    strarray[i] += deleter[j];
                }
            } else {
                for (int j = 0; j < deleter.length; j++) {
                    strarray[i] += deleter[j];
                }
            }
            System.out.println(strarray[i]);
            //pattern matching here...
        }
    }
};
