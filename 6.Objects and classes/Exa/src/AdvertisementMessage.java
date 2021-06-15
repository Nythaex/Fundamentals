import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coments=Integer.parseInt(scanner.nextLine());
                List<Comments> coment=new ArrayList<>();
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors={"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities={"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random=new Random();
        for (int i = 0; i <coments; i++) {
            String phrase=phrases[random.nextInt(phrases.length)];
            String event=events[random.nextInt(events.length)];
            String author=authors[random.nextInt(authors.length)];
            String city=cities[random.nextInt(cities.length)];
            Comments newComment=new Comments(phrase,event,author,city);
            coment.add(newComment);
        }
        for (Comments comentu:coment
             ) {
            System.out.printf("%s %s %s-%s",comentu.phrases,comentu.events,comentu.authors,comentu.cities);
            System.out.println();
        }

    }

    static class Comments {
        String phrases;
        String events;
        String authors;
        String cities;

        public Comments(String phrases, String events, String authors, String cities) {
            this.phrases = phrases;
            this.events = events;
            this.authors = authors;
            this.cities = cities;
        }

    }
}
