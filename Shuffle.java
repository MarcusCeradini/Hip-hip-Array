/*
Name: Marcus Ceradini
Date: 10/2/2025
Description: Prints Shuffle playlist
*/

public class Shuffler{
    public static void main(String[] args){

        String [] playlist = {"Shake It Off - Taylor Swift",
                "I Love You - Barney",
                "Baby Shark - Pinkfong",
                "Never Gonna Give You Up - Rick Astley",
                "Axel F (Crazy Frog) - Crazy Frog",
                "Gangnam Style - PSY",
                "What Does the Fox Say? - Ylvis"};

        Shuffle(playlist);

        System.out.println("Shuffled Playlist: ");

        for (String songs : playlist){
            System.out.println(songs);
        }
    }

    public static void Shuffle (String[] playlist) {
        for (int i = 0; i < playlist.length - 1; i++){
            int j = (int) (Math.random() * playlist.length);

            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
        }
    }
}
