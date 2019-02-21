package project2v2;

//@author JasonChoi

//these things are what you plug in to test!
//Last Tango in Paris
//Gotan Project
//05:50
//sounds/newAgeRhythm.wav

//Where you end
//Moby
//3:18
//sounds/classical.wav

//Big Jet Plane
//Julia Stone
//3:54
//sounds/westernBeat.wav

import java.text.DecimalFormat;
import java.util.*;

public class PlayList
{
	public static void main(String[] args)	
	{

		//Scanner + Time Conversion (setup)
		Scanner in = new Scanner(System.in);
		DecimalFormat numberFormat= new DecimalFormat("#.00");
		
		//First Song
		System.out.println("First Song");
 		String song = in.nextLine();
        	
		System.out.println("Artist");
        	String artist = in.nextLine();
        	
		System.out.println("Time");
        	String l1 = in.nextLine();

		//s1 length
		int cl = l1.indexOf(":");
        	String min = l1.substring(0,cl);
        	String sec = l1.substring(cl+1);
		int nl1 = Integer.parseInt(sec)+(Integer.parseInt(min)*60);
       		System.out.println("Location");
        	String location = in.nextLine();
        	
		//Second Song
        	System.out.println("Second Song");
        	String song2 = in.nextLine();
        	
		System.out.println("Artist");
        	String artist2 = in.nextLine();
        	
		System.out.println("Time");
        	String l2 = in.nextLine();

		//s2 length
        	cl = l2.indexOf(":");
        	min = l2.substring(0,cl);
        	sec = l2.substring(cl+1);
        	int nl2 = Integer.parseInt(sec)+(Integer.parseInt(min)*60);
        	System.out.println("Location");
        	String location2 = in.nextLine();

		//Third Song
        	System.out.println("Third Song");
        	String song3 = in.nextLine();
        
		System.out.println("Artist");
        	String artist3 = in.nextLine();

        	System.out.println("Time");
        	String l3 = in.nextLine();		
       	
		//s3 length       		
        	cl = l3.indexOf(":");
        	min = l3.substring(0,cl);
        	sec = l3.substring(cl+1);
	      	int nl3 = Integer.parseInt(sec)+(Integer.parseInt(min)*60);
        	System.out.println("Location");
        	String location3 = in.nextLine();
        
		//Saving answers
        	Song c1= new Song(song,artist,nl1,location), c2= new Song(song2,artist2,nl2,location2),c3= new Song(song3,artist3,nl3,location3);
        
        	//average play time
        	float average = (c1.getPlayTime()+c2.getPlayTime()+c3.getPlayTime());
		average= average/3;
        	System.out.println("Average Time:"+ average);     

        	//song closest to 4 mins(240 secs)
        	int t1 = c1.getPlayTime()-240,t2= c2.getPlayTime()-240,t3=  c3.getPlayTime()-240;
        	int time;
         	
		do {
         		time=t1;
         		t1=-time;
         	} while(t1<0);
        
         	do{
         		time=t2;
         		t2=-time;
         	}while(t2<0);
        
        	do{
         		time=t3;
         		t3=-time;
         	}while(t3<0);
        
        
     		String Close= "None";

		//Aranging (do/while does not work very well! -_-)
     		if(t1<= t2){
          	if(t1 <= t3){
              	Close="Song closest to 240 seconds:"+c1.getTitle();
          	}
       		}
        
        	if(t2<= t1){
          	if(t2 <= t3){
              	Close="Song closest to 240 seconds:"+c2.getTitle();
          	}
        	}
        
        	if(t3<= t1){
          	if(t3 <= t2){
              	Close="Song closest to 240 seconds:"+c3.getTitle();
          	}
        	}
        
        	System.out.println(Close);
        
        	//Aranging
        	System.out.println("----------------------------------------------------------------------------");
        	System.out.println("Song                    Artist                        Location          Time");
        	System.out.println("----------------------------------------------------------------------------");
        		
			//do/while does not work very well!
			if(c1.getPlayTime() <= c2.getPlayTime()){
          		if(c2.getPlayTime() <= c3.getPlayTime()){
              		System.out.println(c1.toString());
              		System.out.println(c2.toString());
              		System.out.println(c3.toString());
              		c1.playSong();
              		c2.playSong();
              		c3.playSong();
          		}
        
        		if(c3.getPlayTime() <= c2.getPlayTime()){
          		if(c2.getPlayTime() <= c1.getPlayTime()){
             		System.out.println(c3.toString());
              		System.out.println(c2.toString());
              		System.out.println(c1.toString());
              		c3.playSong();
              		c2.playSong();
              		c1.playSong();
          		}
        		}
        		
        		if(c1.getPlayTime() >= c2.getPlayTime()){
          		if(c1.getPlayTime() <= c3.getPlayTime()){
          		System.out.println(c2.toString());
		      	System.out.println(c1.toString());
		      	System.out.println(c3.toString());
              		c2.playSong();
              		c1.playSong();
              		c3.playSong();
          		}
        		}

        		if(c1.getPlayTime() <= c2.getPlayTime()){
          		if(c2.getPlayTime() >= c3.getPlayTime() && c1.getPlayTime() <= c3.getPlayTime() ){
              		System.out.println(c1.toString());
              		System.out.println(c3.toString());
              		System.out.println(c2.toString());
              		c1.playSong();
              		c3.playSong();
              		c2.playSong();
          		}
        		}
        		if(c1.getPlayTime() >= c3.getPlayTime() && c2.getPlayTime() <= c3.getPlayTime()){
              		System.out.println(c2.toString());
              		System.out.println(c3.toString());
              		System.out.println(c1.toString());
              		c2.playSong();
              		c3.playSong();
              		c1.playSong();
        		}
        		}

			
        		
			
        		if(c1.getPlayTime() >= c3.getPlayTime()&&c1.getPlayTime() <= c2.getPlayTime() && c3.getPlayTime() <= c2.getPlayTime()){
              		System.out.println(c3.toString());
              		System.out.println(c1.toString());
              		System.out.println(c2.toString());
              		c3.playSong();
              		c1.playSong();
              		c2.playSong();
          		}
 
        		System.out.println("----------------------------------------------------------------------------");
   
    			}
    }

