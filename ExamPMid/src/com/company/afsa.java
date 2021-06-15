package com.company;
import java.util.*;
import java.util.stream.Collectors;

class Commands0fas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split("\\s+");
            List<String> reverse = new ArrayList<>();
            List<String> sort = new ArrayList<>();

            switch (command[0]){
                case "reverse":
                    int start = Integer.parseInt(command[2]);
                    int count = Integer.parseInt(command[4]);

                    for (int i = 0; i < count ; i++) {
                        reverse.add(list.get(start));
                        start++;
                    }
                    Collections.reverse(reverse);
                    break;

                case "sort":
                    start = Integer.parseInt(command[2]);
                    count = Integer.parseInt(command[4]);

                    for (int i = 0; i < count; i++) {
                        sort.add(list.get(start));
                        start++;
                    }
                    Collections.sort(sort);
                    break;

                case "remove":
                    int remove = Integer.parseInt(command[1]);
                    if (remove > 0) {
                        list.subList(0, remove).clear();
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", list));
    }
}
