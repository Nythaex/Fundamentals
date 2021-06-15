import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Article> article=new ArrayList<>();
        String[] splited=scanner.nextLine().split(",");
        int commandsCount=Integer.parseInt(scanner.nextLine());
        Article art=new Article(splited[0],splited[1],splited[2]);
        article.add(art);
        for (int i = 0; i<commandsCount; i++) {
           String[] split=scanner.nextLine().split(":");
           if (split[0].equals("Edit")){
            article.get(0).setContent(split[1]);
           }else if (split[0].equals("ChangeAuthor")){
               article.get(0).setAuthor(split[1]);
           }else if (split[0].equals("Rename")){
               article.get(0).setTitle(split[1]);
           }

        }
        for (Article arti:article
             ) {
            System.out.println(arti.title+" -"+arti.content+":"+arti.author);
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
