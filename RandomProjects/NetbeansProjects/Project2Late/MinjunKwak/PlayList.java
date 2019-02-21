/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package project2;

/**
 * Project 2: PlayList
 * creates a PlayList which plays the songs in order
 * @author Minjun Kwak
 */
import java.util.*;
public class PlayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //prompts user for first song details
        Scanner in = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = in.nextLine();
        System.out.print("Enter artist: ");
        String artist = in.nextLine();
        System.out.print("Enter play time (mm:ss): ");
        String playTime = in.nextLine();
        System.out.print("Enter file path: ");
        String filePath = in.nextLine();
        
        //converts string (mm:ss) to an int
        String[] h1 = playTime.split(":");
        int minute = Integer.parseInt(h1[0]);
        int seconds = Integer.parseInt(h1[1]);
        int totalSec = seconds+(60*minute);
        
        //creates first song object
        Song song1 = new Song(title, artist, totalSec, filePath);
        double time1 = song1.getPlayTime();
        
        //prompts user for second song details
        System.out.print("Enter second title: ");
        title = in.nextLine();
        System.out.print("Enter second artist: ");
        artist = in.nextLine();
        System.out.print("Enter second play time (mm:ss): ");
        playTime = in.nextLine();
        System.out.print("Enter second file path: ");
        filePath = in.nextLine();
        
        //converts string to int
        h1 = playTime.split(":");
        minute = Integer.parseInt(h1[0]);
        seconds = Integer.parseInt(h1[1]);
        totalSec = seconds+(60*minute);
        
        //creates second song object
        Song song2 = new Song(title, artist, totalSec, filePath);
        double time2 = song2.getPlayTime();
        
        //prompts user for third song details
        System.out.print("Enter third title: ");
        title = in.nextLine();
        System.out.print("Enter third artist: ");
        artist = in.nextLine();
        System.out.print("Enter third play time (mm:ss): ");
        playTime = in.nextLine();
        System.out.print("Enter third file path: ");
        filePath = in.nextLine();
        
        //converts string to int
        h1 = playTime.split(":");
        minute = Integer.parseInt(h1[0]);
        seconds = Integer.parseInt(h1[1]);
        totalSec = seconds+(60*minute);
        
        //creates third song object
        Song song3 = new Song(title, artist, totalSec, filePath);
        double time3 = song3.getPlayTime();
        
      
        //sorts songs by play time
        
        String place1 = "", place2 = "", place3 = "";
        //finds first song in order of least to greatest in seconds
         if(time1 < time2 && time1 < time3){
            place1 = song1.toString();
         }else if( time2 < time1 && time2 < time3){
            place1 = song2.toString();
            }else if(time3 < time1 && time3 < time2){
            place1 = song3.toString();
    }
         //finds third song in order of leasat to greatest in seconds
           if(time1 > time2 && time1 > time3){
            place3 = song1.toString(); 
           } else if(time2 > time1 && time2 > time3){
            place3 = song2.toString(); 
           } else if(time3 > time2 && time3 > time1){
            place3 = song3.toString(); 
           }  

            //finds second song in order of leasat to greatest in seconds
            if(time1 > time2 && time1 < time3 || time1 < time2 && time1 > time3 ){
            place2 = song1.toString(); 
           } else if(time2 > time1 && time2 < time3 || time2 < time1 && time2 > time3){
            place2 = song2.toString(); 
           } else if(time3 > time1 && time3 < time2 || time3 < time1 && time3 > time2){
            place2 = song3.toString(); 
           }
        if(time1 == time2 && time2 == time3){
            place1 = song1.toString();
            place2 = song2.toString();
            place3 = song3.toString();
        }
        else if(time1 == time2 && time1 > time3){
            place1 = song3.toString();
            place2 = song1.toString();
            place3 = song2.toString();
        }
        else if(time1 == time3 && time1 < time2){
            place1 = song1.toString();
            place2 = song3.toString();
            place3 = song2.toString();
           }  
        else if(time2 == time3 && time2 < time1){
            place1 = song2.toString();
            place2 = song3.toString();
            place3 = song1.toString();
           }  
        else if(time1 == time2 && time1 > time3){
            place1 = song3.toString();
            place2 = song1.toString();
            place3 = song2.toString();
            } 
        else  if(time1 == time3 && time1 > time2){
            place1 = song2.toString();
            place2 = song1.toString();
            place3 = song3.toString();
           }  
        else if(time2 == time3 && time2 > time1){
            place1 = song1.toString();
            place2 = song2.toString();
            place3 = song3.toString();
           }
         

        
        //prints playlist
        System.out.println("================================================================================================\n"+"Title                    "+"Artist                    "+"File Name            "+"Play Time\n"+place1+"\n"+place2+"\n"+place3);
        
        //calculates average time
        double avgTime = (time1+time2+time3)/3;
        System.out.println("Average play time: "+avgTime);
        
        //finds which song's play time is closest to 4 min
        double a1 = Math.abs(240 - time1);
        double a2 = Math.abs(240 - time2);
        double a3=  Math.abs(240 - time3);
        if(a1 <= a2 && a1 <= a3){
            System.out.println("Song with play time closest to 240 sec is: "+song1.getTitle());
        }
        else if(a2 <= a1 && a2 <= a3){
            System.out.println("Song with play time closest to 240 sec is: "+song2.getTitle());
        }
        else if(a3 <= a1 && a3 <= a2){
            System.out.println("Song with play time closest to 240 sec is: "+song3.getTitle());
        }
        
        //plays each song in order
        //first song
        if(place1.equals(song1.toString())){
            song1.playSong();
        }
        else if(place1.equals(song2.toString())){
            song2.playSong();
        }
        else if(place1.equals(song3.toString())){
            song3.playSong();
        }
        //second song
        if(place2.equals(song1.toString())){
            song1.playSong();
        }
        else if(place2.equals(song2.toString())){
            song2.playSong();
        }
        else if(place2.equals(song3.toString())){
            song3.playSong();
        }
        //third song
        if(place3.equals(song1.toString())){
            song1.playSong();
        }
        else if(place3.equals(song2.toString())){
            song2.playSong();
        }
        else if(place3.equals(song3.toString())){
            song3.playSong();
        }
        
   
        
        
        
    }
}
    
