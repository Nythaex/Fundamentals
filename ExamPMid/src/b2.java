import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rooms = scanner.nextLine().split("\\|");
        int room = 0;
        int health = 100;
        int bitcoins = 0;
        for (int i = 0; i <= rooms.length - 1; i++) {
            room = room + 1;
            String[] roomInfo = rooms[i].split(" ");
            if (roomInfo[0].equals("potion")) {
                if (Integer.parseInt(roomInfo[1])+health>100){
                    System.out.printf("You healed for %d hp.%n",100-health);
                    health=100;
                }else {
                    health+=Integer.parseInt(roomInfo[1]);
                    System.out.printf("You healed for %d hp.%n",Integer.parseInt(roomInfo[1]));
                }
                    System.out.printf("Current health: %d hp.%n",health);
            } else if (roomInfo[0].equals("chest")) {
                bitcoins += Integer.parseInt(roomInfo[1]);
                System.out.printf("You found %s bitcoins.%n", roomInfo[1]);
            } else {
                if (health - Integer.parseInt(roomInfo[1]) > 0) {
                    System.out.printf("You slayed %s.%n", roomInfo[0]);
                    health -= Integer.parseInt(roomInfo[1]);
                } else {
                    System.out.printf("You died! Killed by %s.%n", roomInfo[0]);
                    System.out.printf("Best room: %d%n", room);
                    return;
                }

            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);
    }
}
