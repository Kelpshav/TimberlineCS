import java.io.*;
import java.util.*;
public class PlayList
{
	//PlayList project by Sarthak Jain, Period 2, APCSA
    public static void main(String[] args)
    {
	//declares variables below
        int reps=3, convert1,convert2,PlayTime;
        Song song_1 = new Song();
        Song song_2 = new Song();
        Song song_3 = new Song(); 
        Song song1 = new Song();
        Song song2 = new Song();
        Song song3 = new Song(); 
        //Creates a scanner
        Scanner in = new Scanner(System.in);
        //sets a do while loop
	do{
        //asks user to enter the title of the song
	System.out.println("Enter title of song:");
        String title = in.nextLine();
        //asks the user to enter the name of the artist
	System.out.println("Enter the name of the artist:");
        String artist = in.nextLine();
        //asks the user to enter the song length
	System.out.println("Enter length of the song:");
        String length = in.nextLine();
        //asks the user to enter the name of the file
	System.out.println("Enter file name:");
        String filename = in.nextLine();

	//changes the play time to seconds
	String[]lengthTokens=length.split(":");
	int minutes = Integer.parseInt(lengthTokens[0]);
	int seconds = Integer.parseInt(lengthTokens[1]);
	PlayTime = minutes*60 + seconds;
        //starts a switch statement that compares the three given songs
	switch (reps){
            case 3:
                song_1 = new Song(title,artist,PlayTime,filename);
            break;
            case 2:
                song_2 = new Song(title,artist,PlayTime,filename);
            break;
            case 1:
                song_3 = new Song(title,artist,PlayTime,filename);
            break;
        }
        //assigns gathered info to 3 different songs
        reps--;
        }while(reps>0);
        int playtime1 = song_1.getPlayTime();
        int playtime2 = song_2.getPlayTime();
        int playtime3 = song_3.getPlayTime();
        //gets play times through if statements
        if(playtime1<=playtime2){
            if(playtime1<=playtime3){
                song1 = song_1; //plays song1
                if(playtime2<=playtime3){
                    song2 = song_2;
                    song3 = song_3;
                }
                else if(playtime3<=playtime2){
                    song2 = song_3;
                    song3 = song_2;
                }
            }
            else if(playtime3<=playtime1){
                song3 = song_1;
                song1 = song_2;
                song2 = song_3;
            }
        }
        else if(playtime2<=playtime1){
            if(playtime2<=playtime3){
                song2 = song_1;
                if(playtime1<=playtime3){
                    song1 = song_2;
                    song3 = song_3;
                }
                else if(playtime3<=playtime1){
                    song1 = song_3;
                    song3 = song_2;
                }
            }
            else if(playtime3<=playtime2){
                song3 = song_1;
                song2 = song_2;
                song1 = song_3;
            }
        }
        //Prints the average play time
        System.out.println("The Average Play Time is "+((playtime1+playtime2+playtime3)/3)+" seconds.");
        //prints song closest to 240 seconds three times
        int comp1 = Math.abs(playtime1-240),comp2 = Math.abs(playtime2-240),comp3 = Math.abs(playtime3-240);
        if(comp1<=comp2&&comp1<=comp3){
            System.out.println("The song with the play time closest to 240 seconds is: "+song_1.getTitle());
        }
        if(comp2<=comp1&&comp2<=comp3){
            System.out.println("The song with the play time closest to 240 seconds is: "+song_2.getTitle());
        }
        if(comp3<=comp2&&comp3<=comp1){
            System.out.println("The song with the play time closest to 240 seconds is: "+song_3.getTitle());
        }
        //prints Playlist in chronological order
        System.out.println("Here is your playlist:");
        System.out.println("------------------------------------------------------------------\n " + song1.toString());
        System.out.println("------------------------------------------------------------------\n " + song2.toString());
        System.out.println("------------------------------------------------------------------\n " + song3.toString());

        //plays the songs
        song1.playSong();
        song2.playSong();
        song3.playSong();

    }
}
