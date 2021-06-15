import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] splited=scanner.nextLine().split(" ");
        int [] raceTime=new int[splited.length];
        for (int i = 0; i <= splited.length - 1; i++) {
           raceTime[i]=Integer.parseInt(splited[i]);
        }
        double firstCarTime=0;
        double secondCarTime=0;
        double theWinerTime=0;
        String theWiner="";
        for (int i = 0; i <= (raceTime.length - 2)/2; i++) {
             if (raceTime[i]==0){
                 firstCarTime*=0.8;
             }
             else {
                 firstCarTime+=raceTime[i];
             }
            if (raceTime[raceTime.length-1-i]==0){
                secondCarTime*=0.8;
            }
            else {
                secondCarTime+=raceTime[raceTime.length-1-i];
            }
        }
         if (firstCarTime<=secondCarTime){
             System.out.printf("The winner is left with total time: %.1f",firstCarTime);
         }
          else {
             System.out.printf("The winner is right with total time: %.1f",secondCarTime);
         }


    }
}
