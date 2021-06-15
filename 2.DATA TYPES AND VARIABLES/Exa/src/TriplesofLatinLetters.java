import java.util.Scanner;

public class TriplesofLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (char i = 0; i <num; i++) {
            for (char j=0;j<num;j++) {
                for (char f=0;f<num;f++){
                    char first= (char) ('a'+i);
                    char second= (char) (j+'a');
                    char third= (char) (f+'a');

                    System.out.printf("%c%c%c",first,second,third);
                    System.out.println();
                }

            }

        }

    }
}
