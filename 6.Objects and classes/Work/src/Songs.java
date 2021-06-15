import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int songsCount = Integer.parseInt(scanner.nextLine());
        List<SongsInfo> songs = new ArrayList<>();
        for (int i = 0; i < songsCount; i++) {
            String[] splitedInfo=scanner.nextLine().split("_");
            SongsInfo theSong=new SongsInfo(splitedInfo[0],splitedInfo[1],splitedInfo[2]);
            songs.add(theSong);
        }
        String wantedType=scanner.nextLine();
        if (wantedType.equals("all")){
            for (SongsInfo theSong:songs
                 ) {
                System.out.println(theSong.nameOfSong);
            }
        }
        else {
            for (SongsInfo theSong:songs
                 ) {
                if (theSong.typeOfSong.equals(wantedType)){
                    System.out.println(theSong.nameOfSong);
                }
            }
        }


    }

    static class SongsInfo {
        String typeOfSong;
        String nameOfSong;
        String timeOfSong;
       SongsInfo(String name,String type,String time){
           this.typeOfSong=name;
           this.nameOfSong=type;
           this.timeOfSong=time;

       }


    }

}
