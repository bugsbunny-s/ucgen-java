import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner (System.in);
        System.out.print("n sayısını giriniz : ");
        int n = inp.nextInt();
        double res=0;

        for(double i=1; i<=n; i++){
            res += (1/i);
        }
        System.out.println(res);
    }
}