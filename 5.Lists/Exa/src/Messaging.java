import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] numbers=scanner.nextLine().split(" ");
        int[] nums=new int[numbers.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            String []splited=numbers[i].split("");
            for (int a = 0; a <= splited.length - 1; a++) {
               nums[i]+=Integer.parseInt(splited[a]);
            }
        }
        List<Character> characterList=new ArrayList<>();
        String[]splitedSentence=scanner.nextLine().split("");
        for (int i = 0; i <= splitedSentence.length - 1; i++) {
            characterList.add(splitedSentence[i].charAt(0));
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            int c=1;
            for (int a = 1; a <=nums[i]; a++) {
              if (c==characterList.size()){
                  c=1;
              }else {
                  c++;
              }
            }
            System.out.print(characterList.get(c-1));
            characterList.remove(c-1);
        }

    }
}
