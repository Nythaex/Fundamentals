import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Article> article=new ArrayList<>();
        int count=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <count; i++) {
            String[] splited=scanner.nextLine().split(", ");
            Article arr=new Article(splited[0],splited[1],splited[2]);
            article.add(arr);
        }
        String sortType=scanner.nextLine();
        switch (sortType){
            case "title":
                article.stream().sorted((t1,t2)->t1.title.compareTo(t2.title))
                        .forEach(art->System.out.printf("%s - %s: %s%n",art.title,art.content,art.author)); break;
            case "content":
                article.stream().sorted((c1,c2)->c1.content.compareTo(c2.content))
                        .forEach(art->System.out.printf("%s - %s: %s%n",art.title,art.content,art.author));break;
            case "author":
                article.stream().sorted((a1,a2)->a1.author.compareTo(a2.author))
                        .forEach(art->System.out.printf("%s - %s: %s%n",art.title,art.content,art.author));break;
        }

    }
    static class Article{
        String title;
        String content;
        String author;
        Article(String title,String content,String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
}
