import java.util.Scanner;
public class uc {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        System.out.print("satır sayısı gir : ");
        int n = inp.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j <= (i + 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2*(n - i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        }
    }