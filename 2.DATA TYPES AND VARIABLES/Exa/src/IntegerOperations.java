    import java.util.Scanner;

    public class IntegerOperations {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            long first=Long.parseLong(scanner.nextLine());
            long second=Long.parseLong(scanner.nextLine());
            long third=Long.parseLong(scanner.nextLine());
            long fourth=Long.parseLong(scanner.nextLine());

            long sum=((first+second)/third)*fourth;
            System.out.println(sum);

        }
    }
