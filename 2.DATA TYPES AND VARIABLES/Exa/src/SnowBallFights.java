import java.util.Scanner;

public class SnowBallFights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowBalls = Integer.parseInt(scanner.nextLine());
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        long bestValue = 0L;
        for (int i = 1; i <= snowBalls; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            long value = (long) Math.pow(snow / time, quality);
            if (value>bestValue){
                bestSnow=snow;
                bestTime=time;
                bestQuality=quality;
                bestValue=value;
            }
        }
        System.out.printf("%d : %d = %d (%d)",bestSnow,bestTime,bestValue,bestQuality);
    }
}
