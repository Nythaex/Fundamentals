import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int startPower = power;
        int distance = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactor=Byte.parseByte(scanner.nextLine());
        int pokedCount = 0;

        while (power >= distance) {
            pokedCount++;
            power-=distance;
            if (startPower/2==power && exhaustionFactor>0){
                power/=exhaustionFactor;
            }
        }
        System.out.println(power);
        System.out.println(pokedCount);
    }
}
