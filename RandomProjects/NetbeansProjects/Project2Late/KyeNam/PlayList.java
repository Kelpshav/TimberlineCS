/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package Project2

/**
 * Project 2 : PlayList
 * This Java application creates a file where it prints out the Title, Artist Name, File path, the length of the song, the average time of the songs, and the song with play time closest to 240 seconds. Also plays a song, new song everytime it resets.
 * @author Kyeongseo Nam
 */

import java.util.*;


public class PlayList {

	/**
 	* @param args the command line arguments
 	*/
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------

	public static void main(String[] args) {
    	//Song 1 , Prompting the user for details of Song 1
    	// Title, Artist, Length, Path
    	Scanner Sc = new Scanner(System.in);
    	System.out.print("Enter the First Song Title :");
    	String Title= Sc.nextLine();
    	System.out.print("Enter the First Artist Name : ");
    	String Artist= Sc.nextLine();
    	System.out.print("Enter the Length of the First Song : ");
    	String length= Sc.nextLine();
    	System.out.print("Path to the First Song : ");
    	String filePath = Sc.nextLine();
   	 
    	//Converting the splited String(Time minutes and seconds) into an Integer
    	String[] s1 = length.split(":");
    	int minutes = Integer.parseInt(s1[0]);
    	int seconds = Integer.parseInt(s1[1]);
    	int totalSeconds = seconds+(60*minutes);
   	 
    	// This creates the song order for #1
    	Song Song1 = new Song(Title, Artist, totalSeconds, filePath);
    	double time1 = Song1.getPlayTime();
   	 
   	 
   	 
   	 
   	 
   	 
     	//Song 2 , Prompting the user for details of Song 2
    	// Title, Artist, Length, Path
    	System.out.print("Enter the Second Song Title :");
    	Title= Sc.nextLine();
    	System.out.print("Enter the Second Artist Name : ");
    	Artist= Sc.nextLine();
    	System.out.print("Enter the Length of the Second Song : ");
    	length= Sc.nextLine();
    	System.out.print("Path to the Second Song : ");
    	filePath = Sc.nextLine();
   	 
    	//Converting the splited String(Time minutes and seconds) into an Integer
    	s1 = length.split(":");
    	minutes = Integer.parseInt(s1[0]);
    	seconds = Integer.parseInt(s1[1]);
    	totalSeconds = seconds+(60*minutes);
   	 
    	//Creating the Song Order for #2
    	Song Song2 = new Song(Title, Artist, totalSeconds, filePath);
    	double time2 = Song2.getPlayTime();
   	 
   	 
   	 
   	 
   	 
   	 
    	//Song 3 , Prompting the user for details of Song 3
    	// Title, Artist, Length, Path
    	System.out.print("Enter the Third Song Title :");
    	Title= Sc.nextLine();
    	System.out.print("Enter the Third Artist Name : ");
    	Artist= Sc.nextLine();
    	System.out.print("Enter the Length of the Third Song : ");
    	length= Sc.nextLine();
    	System.out.print("Path to the Thireed Song : ");
    	filePath = Sc.nextLine();
   	 
    	//Converting the splited String(Time minutes and seconds) into an Integer
    	s1 = length.split(":");
    	minutes = Integer.parseInt(s1[0]);
    	seconds = Integer.parseInt(s1[1]);
    	totalSeconds = seconds+(60*minutes);
   	 
    	//Creating the Song Order for #3
    	Song Song3 = new Song(Title, Artist, totalSeconds, filePath);
    	double time3 = Song3.getPlayTime();
   	 
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------
   	 
    	//Sorting the Songs by the Length of the Song
    	String Order1 = "", Order2 = "", Order3 = "";
   	 
    	//Song for Order 1
    	if(time1 < time2 && time1 < time3){
        	Order1 = Song1.toString();
    	}
    	else if( time2 < time1 && time2 < time3 ){
        	Order1 = Song2.toString();
    	}
    	else if(time3 < time1 && time3 < time2){
        	Order1 = Song3.toString();
    	}
   	 
    	//Second Song in Order 2
    	if(time1 > time2 && time1 < time3 || time1 < time2 && time1 > time3){ // 2<1<3 or 3<1<2
        	Order2 = Song1.toString();
    	}
    	else if(time2 > time1 && time2 < time3 || time2 < time1 && time2 > time3){ // 1<2<3 or 3<2<1
        	Order2 = Song2.toString();
    	}
    	else if (time3 > time2 && time3 < time1 || time3 < time2 && time3 > time1){ // 2<3<1 or 1<3<2
        	Order2 = Song3.toString();
    	}
   	 
       	 
    	//Song for Order 3
    	if(time1 > time2 && time1 > time3){
        	Order3 = Song1.toString();
    	}
    	else if(time2 > time1 && time2 > time3){
        	Order3 = Song2.toString();
    	}
    	else if(time3 > time1 && time3 > time2){
        	Order3 = Song3.toString();
    	}
   	 
    	//Order for when some or all of them are equal
    	if(time1 == time2 && time1 == time3){ //All Equal
        	Order1 = Song1.toString();
        	Order2 = Song2.toString();
        	Order3 = Song3.toString();
    	}
    	else if(time1 == time2 && time1 > time3){ // 1=2 and 1>3
        	Order1 = Song3.toString();
        	Order2 = Song1.toString();
        	Order3 = Song2.toString();
    	}
    	else if(time1 == time2 && time1 < time3){ // 1=2 and 1<3
        	Order1 = Song1.toString();
        	Order2 = Song2.toString();
        	Order3 = Song3.toString();
    	}
    	else if(time1 == time3 && time1 > time2){ // 1=3 and 1>2
        	Order1 = Song2.toString();
        	Order2 = Song1.toString();
        	Order3 = Song3.toString();
    	}
    	else if(time1 == time3 && time1 < time2){ // 1=3 and 2<1
        	Order1 = Song1.toString();
        	Order2 = Song3.toString();
        	Order3 = Song2.toString();
    	}
    	else if(time2 == time3 && time2 > time1){ // 2=3 and 1<2
        	Order1 = Song1.toString();
        	Order2 = Song2.toString();
        	Order3 = Song3.toString();
    	}
    	else if(time2 == time3 && time2 < time1){ // 2=3 and 2<1
        	Order1 = Song2.toString();
        	Order2 = Song3.toString();
        	Order3 = Song1.toString();
    	}
   	 
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------
    	//---------------------------------------------------------------------
      	 

    	//Prints out the information and plays the Song
   	 
    	System.out.println("\n=============================================================================\n"+"Title                	"+"Artist           	"+"File Path          	"+"Play Time\n\n"+Order1+"\n"+Order2+"\n"+Order3+"\n=============================================================================");
   	 
   	 
    
    	//calculates average time
    	double avgTime = (time1+time2+time3)/3;
    	System.out.println("Average play time: "+avgTime);
   	 
    	//finds which Song's play time is closest to 4 min
    	double d1 = Math.abs(240 - time1);
    	double d2 = Math.abs(240 - time2);
    	double d3=  Math.abs(240 - time3);
    	if(d1 <= d2 && d1 <= d3){
        	System.out.println("Song with play time closest to 240 sec is: "+Song1.getTitle());
    	}
    	else if(d2 <= d1 && d2 <= d3){
        	System.out.println("Song with play time closest to 240 sec is: "+Song2.getTitle());
    	}
    	else if(d3 <= d1 && d3 <= d2){
        	System.out.println("Song with play time closest to 240 sec is: "+Song3.getTitle());
    	}
   	 
	//plays three Songs in order
    	//first Song
    	if(Order1.equals(Song1.toString())){
        	Song1.playSong();
    	}
    	else if(Order1.equals(Song2.toString())){
        	Song2.playSong();
    	}
    	else if(Order1.equals(Song3.toString())){
        	Song3.playSong();
    	}
    	//second Song
    	if(Order2.equals(Song1.toString())){
        	Song1.playSong();
    	}
    	else if(Order2.equals(Song2.toString())){
        	Song2.playSong();
    	}
    	else if(Order2.equals(Song3.toString())){
        	Song3.playSong();
    	}
    	//third Song
    	if(Order3.equals(Song1.toString())){
        	Song1.playSong();
    	}
    	else if(Order3.equals(Song2.toString())){
        	Song2.playSong();
    	}
    	else if(Order3.equals(Song3.toString())){
        	Song3.playSong();
    	}
   	 
   	 
	}
}

    












