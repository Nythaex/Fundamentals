import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String message=scanner.next();
        String command=scanner.nextLine();
        while (!command.equals("Finish")){
            String [] tokens=command.split("\\s+");
            switch (tokens[0]){
                case "Replace":
                    message=message.replace(tokens[1],tokens[2]);
                    System.out.println(message);
                    break;
                case "Cut":
                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);
                    if (start<0||end>=message.length()){
                        System.out.println("Invalid indices!");
                    }else {
                        StringBuilder changing = new StringBuilder(message).delete(start, end+1);
                        message = changing.toString();
                        System.out.println(message);
                    }
                    break;
                case "Make":
                    String casee=tokens[1];
                    if (casee.equals("Upper")){
                     message=message.toUpperCase();
                    }else if (casee.equals("Lower")){
                        message=message.toLowerCase();
                    }
                    System.out.println(message);
                    break;
                case "Check":
                    String substring=tokens[1];
                    if (message.contains(substring)){
                        System.out.println("Message contains "+substring);
                    }else {
                        System.out.println("Message doesn't contain "+substring);
                    }
                    break;
                case "Sum":
                    start = Integer.parseInt(tokens[1]);
                    end = Integer.parseInt(tokens[2]);
                    if (start<0||end>=message.length()){
                        System.out.println("Invalid indices!");
                    }else {
                        substring=message.substring(start,end+1);
                        int sum=0;
                        for (int i = 0; i <= substring.length() - 1; i++) {
                            sum+=substring.charAt(i);
                        }
                        System.out.println(sum);
                    }
                    break;
            }

            command=scanner.nextLine();
        }

    }
}
