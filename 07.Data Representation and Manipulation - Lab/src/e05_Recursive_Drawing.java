import java.util.Collections;
import java.util.Scanner;

public class e05_Recursive_Drawing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n =  Integer.parseInt(scan.nextLine());

        draw(n);
    }

    private static void draw(int n) {
        if (n <= 0)
            return;
        System.out.println(String.join("",Collections.nCopies(n,"*")));
        draw(n - 1);
        System.out.println(String.join("",Collections.nCopies(n,"#")));
    }
}
