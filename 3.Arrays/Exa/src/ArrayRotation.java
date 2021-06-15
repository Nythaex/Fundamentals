import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        int times=Integer.parseInt(scanner.nextLine());
        String[] strArray=str.split(" ");
        String container="";
        for (int i = 0; i < times; i++) {
            container=strArray[0];
            for (int a = 0; a <= strArray.length - 1; a++) {
                if (a == strArray.length - 1
                ) {
                    strArray[a]=container;
                }
                else {
               strArray[a]=strArray[a+1];}

            }
        }
        str=String.join(" ",strArray);
        System.out.println(str);

    }
}



