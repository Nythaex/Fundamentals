import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers=new ArrayList<>();
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        for (int i = 0; strArray.length - 1 >= i; i++) {
            numbers.add(Integer.parseInt(strArray[i]));
        }

        String command=scanner.nextLine();
        while (!(command.equals("end"))){
            String []array=command.split(" ");
            if (array[0].equals("Add")){
                numbers.add(Integer.parseInt(array[1]));
            }
            else if (array[0].equals("Remove")){
                numbers.remove((Object)Integer.parseInt(array[1]));
            }
            else if (array[0].equals("RemoveAt")){
                numbers.remove(Integer.parseInt(array[1]));
            }
            else if (array[0].equals("Insert")){
                int index=Integer.parseInt(array[2]);
                int number=Integer.parseInt(array[1]);
                numbers.add(index,number);
            }
            command=scanner.nextLine();
        }
        for (int num:numbers
        ) {
            System.out.print((num)+" ");
        }
    }
}
