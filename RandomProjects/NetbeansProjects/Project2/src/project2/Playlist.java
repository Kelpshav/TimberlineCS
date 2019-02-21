/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author timberlinepluska
 */
public class Playlist {
    static String title, artist, path;
    static int length;
    public static void main(String args[]){
        title = "Classical Song";
        artist = "Some artist";
        path = "/home/timberlinepluska/Desktop/APCSA/Project2/src/sounds/classical.wav";
        length = 60;
        
        Song song1 = new Song(title, artist, length, path);
        //song1.playSong();
        System.out.println(song1.getArtist());
        System.out.println(song1.getPlayTime());
        System.out.println("============================================");
        System.out.println(song1.toString());
    
    }
    
}
