    import java.util.Scanner;

    public class DataTypes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String Type = scanner.nextLine();
            switch (Type) {
                case "int":
                    int sum=Integer.parseInt(scanner.nextLine())*2;
                    PrintType(sum);
                    break;
                case "real":
                    double sumi=Double.parseDouble(scanner.nextLine())*1.5;
                    PrintType(sumi);
                    break;
                case "string":
                    String text=scanner.nextLine();
                    PrintType(text);
                    break;
            }

        }

        private static void PrintType(int sum) {
            System.out.println(sum);
        }
        private static void PrintType(double sumi) {
            System.out.printf("%.2f",sumi);
        }

        private static void PrintType(String type) {
            System.out.println("$"+type+"$");

        }
    }
