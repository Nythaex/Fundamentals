import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] spam = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> theList = new ArrayList<>();
        for (int i = 0; i <= spam.length - 1; i++) {
            theList.add(spam[i]);
        }
        int sum=0;
        while (!theList.isEmpty()){
            int removedOne=-1;
            int distance=Integer.parseInt(scanner.nextLine());
            if (distance<0){
                removedOne=theList.get(0);
                sum+=removedOne;
             theList.set(0,theList.get(theList.size()-1));

            }else if (distance>theList.size()-1){
                removedOne=theList.get(theList.size()-1);
                sum+=removedOne;
                theList.set(theList.size()-1,theList.get(0));
            }else {
                removedOne=theList.remove(distance);
                sum+=removedOne;
            }for (int i = 0; i <= theList.size() - 1; i++) {
                if (theList.get(i)<=removedOne){
                    theList.set(i,theList.get(i)+removedOne);
                }else {
                    theList.set(i,theList.get(i)-removedOne);
                }
            }
        }
        System.out.println(sum);

    }
}
