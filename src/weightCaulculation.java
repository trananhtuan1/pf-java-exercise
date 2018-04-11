import java.util.Scanner;

public class weightCaulculation {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Calculation");
        System.out.println("-------------------");
        System.out.printf("Enter Weight(kg) = ");
        weight = scanner.nextDouble();
        System.out.printf("Enter Height(m) = ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println(bmi + " -> Under Weight");
        } else if (bmi < 25) {
            System.out.println(bmi + " -> Normal");
        } else if (bmi < 30) {
            System.out.println(bmi + " -> Over Weight");
        } else {
            System.out.println(bmi + " -> Obse");
        }
    }
}
