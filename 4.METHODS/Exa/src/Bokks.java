import java.util.Scanner;

public class Bokks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int books=Integer.parseInt(scanner.nextLine());
        String TypeSheets=scanner.nextLine();
        int pages=Integer.parseInt(scanner.nextLine());
        double sum=0;
        if(TypeSheets.equals("black and white books")){
            double platesPrice=pages*7;
            double forThePaper=((pages/2)*books/100)*1;
            sum=sum+platesPrice+forThePaper;
        }
        else {
           double platesPrice=pages*28;
           double forThePaper=(pages/2)*books*4;
            sum=sum+platesPrice+forThePaper;
        }
        double forBinding=books*2;
        sum=sum+forBinding;
        sum=sum+(sum*0.175);
        System.out.printf("%.2f",sum);

    }
}
