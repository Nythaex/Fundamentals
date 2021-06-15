import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] things = scanner.nextLine().split(", ");
        List<String> materials = new ArrayList<>();
        for (String n : things
        ) {
            materials.add(n);
        }
        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] splited = command.split(" - ");
            if (splited[0].equals("Collect")){
              if (!materials.contains(splited[1])){
                  materials.add(splited[1]);
              }
            }else if (splited[0].equals("Drop")){
                if (materials.contains(splited[1])){
                    materials.remove(splited[1]);
                }
            }
            else if (splited[0].equals("Combine Items")){
                int spot=0;
                String []mat=splited[1].split(":");
                if (materials.contains(mat[0])){
                    for (int i = 0; i <= materials.size()-1; i++) {
                     if (materials.get(i).equals(mat[0])){
                         spot=i+1;
                     }
                    }
                    materials.add(spot,mat[1]);
                }

            }else if (splited[0].equals("Renew")){
                if (materials.contains(splited[1])){
                    materials.remove(splited[1]);
                    materials.add(splited[1]);
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i <= materials.size() - 1; i++) {
            System.out.print(materials.get(i));
            if (i!=materials.size()-1){
                System.out.print(", ");
            }
        }
/////////1:28:00
    }
}
