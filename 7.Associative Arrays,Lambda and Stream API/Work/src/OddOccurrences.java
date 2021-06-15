import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> strings=new LinkedHashMap<>();
        String [] splitedStrings=scanner.nextLine().toLowerCase().split(" ");
        for (int i = 0; i <= splitedStrings.length - 1; i++) {
            Integer num=strings.get(splitedStrings[i]);
            if (num==null) {
            num=0;
            }
            strings.put(splitedStrings[i],num+=1);
        }
        List <String> newone=new ArrayList<>();
        for (Map.Entry<String, Integer> entry : strings.entrySet()) {
            if (entry.getValue()%2!=0){
                newone.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",newone));


    }
}
