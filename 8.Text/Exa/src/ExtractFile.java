import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splited = scanner.nextLine().split("\\\\");
        String fil=splited[splited.length-1];
        String[] file = fil.split("\\.");
        System.out.println("File name: "+file[0]);
        System.out.println("File extension: "+file[1]);

    }
}
