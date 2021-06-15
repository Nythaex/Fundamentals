import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(" ");
        String last="";
        int longest=1;
        int lastlongest=0;
        int left=-214;
        for (int i = 0; i <= array.length - 2; i++) {
            if (array[i].equals(array[i+1])){
             longest++;
            }
            else {
                longest=1;
            }
            if (lastlongest<longest){
                lastlongest=longest;
                last=array[i];
            }
        }
        for (int i = 0; i <lastlongest; i++) {
            System.out.print(last+" ");
        }
    }


}
