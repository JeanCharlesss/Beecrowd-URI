import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double A, B, C, MEDIA;
        Scanner in = new Scanner(System.in);
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();
        MEDIA = (A*2 + B*3 + C*5)/10;
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        in.close();
    }

}