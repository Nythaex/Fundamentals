import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, Users> listOfUsers = new TreeMap<>();
        String command = scanner.nextLine();
        while (!command.equals("Statistics")) {
            String[] tokens = command.split("=");
            String theCommand = tokens[0];
            switch (theCommand) {
                case "Add":
                    String user = tokens[1];
                    int sent = Integer.parseInt(tokens[2]);
                    int received = Integer.parseInt(tokens[3]);
                    if (!listOfUsers.containsKey(user)) {
                        Users users = new Users(user, sent, received);
                        listOfUsers.put(user, users);
                    }
                    break;
                case "Message":
                    String senderName = tokens[1];
                    String receivedName = tokens[2];
                    if (listOfUsers.containsKey(senderName) && listOfUsers.containsKey(receivedName)) {
                        listOfUsers.get(senderName).setSent(listOfUsers.get(senderName).getSent() + 1);
                        listOfUsers.get(receivedName).setReceived(listOfUsers.get(receivedName).getReceived() + 1);
                        if (listOfUsers.get(senderName).getSent() + listOfUsers.get(senderName).getReceived() >= capacity) {
                            listOfUsers.remove(senderName);
                            System.out.println(senderName + " reached the capacity!");
                        }

                        if (listOfUsers.get(receivedName).getReceived() + listOfUsers.get(receivedName).getSent() >= capacity) {
                            listOfUsers.remove(receivedName);
                            System.out.println(receivedName + " reached the capacity!");
                        }
                    }
                    break;
                case "Empty":
                    String username = tokens[1];
                    if (username.equals("All")) {
                        listOfUsers.clear();
                    } else {
                        if (listOfUsers.containsKey(username)) {
                            listOfUsers.remove(username);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Users count: " + listOfUsers.size());
        listOfUsers.values().stream()
                .sorted((p1, p2) -> Integer.compare(p2.getReceived(), p1.getReceived()))
                .forEach(p1 -> System.out.println(p1.getName() + " - " + (p1.received + p1.sent)));

    }

    static class Users {
        String name;
        int sent;
        int received;

        public Users(String name, int sent, int received) {
            this.name = name;
            this.sent = sent;
            this.received = received;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSent() {
            return sent;
        }

        public void setSent(int sent) {
            this.sent = sent;
        }

        public int getReceived() {
            return received;
        }

        public void setReceived(int received) {
            this.received = received;
        }
    }
}
