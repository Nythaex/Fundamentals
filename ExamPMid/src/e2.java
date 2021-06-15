import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleLeft = Integer.parseInt(scanner.nextLine());
        String[] wagos = scanner.nextLine().split(" ");
        int [] wagons=new int[wagos.length];
        for (int i = 0; i <= wagons.length - 1; i++) {
         wagons[i]=Integer.parseInt(wagos[i]);
        }
        int index=0;
        while (peopleLeft!=0){
            for (int i = wagons[index]; i < 4; i++) {
                if (peopleLeft==0){
                    continue;
                }
                peopleLeft--;
                wagons[index]++;
            }
            if (index==wagons.length-1){
                break;
            }
            index++;
        }
        if (peopleLeft==0&&index==wagons.length-1&&wagons[index]==4){
            for (int n:wagons
                 ) {
                System.out.print(n+" ");
            }
        }else if (peopleLeft==0){
            System.out.println("The lift has empty spots!");
            for (int n:wagons
                 ) {
                System.out.print(n+" ");
            }
        }
        else {
            System.out.printf("There isn't enough space! %d people in a queue!%n",peopleLeft);
            for (int n:wagons
            ) {
                System.out.print(n+" ");
            }
        }


    }
}
