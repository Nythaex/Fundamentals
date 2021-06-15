import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,List> synonyms=new HashMap<>();
        int c=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= c; i++) {
            String key=scanner.nextLine();
            String value=scanner.nextLine();
            List newList=synonyms.get(key);
            if (newList==null){
                newList=new ArrayList();
                synonyms.put(key,newList);

            }
            newList.add(value);
        }
        for (Map.Entry<String, List> entry : synonyms.entrySet()) {
            System.out.println(entry.getKey()+" - "+String.join(", ",entry.getValue()));
        }

    }
}
