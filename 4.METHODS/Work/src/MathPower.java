    import java.text.DecimalFormat;
    import java.util.Scanner;

    public class MathPower {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            double sum=suming(Double.parseDouble(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
            DecimalFormat df = new DecimalFormat("###.#####");
            System.out.println(df.format(sum));



        }

        private static double suming(double number, int pow) {
             double sum=1;

            for (int i = 0; i < pow; i++) {
             sum*=number;
            }
            return sum;
        }
    }
