# Project 2: Playlist

* Author: Hank Ackler
* Author: Mrs. Pluska
* Class: AP Comp. Sci.
* Semester: Fall 2018

## Overview

This application is designed to take in a number of inputs from the user. These inputs come in the form of a locally stored song's name, artist, duration(mm:ss), and file path. It will then do simple analytics on the songs, and give you the average play time, the song closest to 240 seconds, and a table sorting the songs by play time.
## Compiling and Using

To run, load the files into one package in netbeans, and run. It will do the rest. I saw no requirements for it to run via command line, so I did not implement it.


## Discussion

This project went relatively smoothly, and was acomplished with a fairly simple set of code. Admittedly, I took a very brute force approach to the problem, copy pasting the code with slight modifications for each song object, and then using a a tree of "if" statements to sort it. The code is not super pretty, and would be a nightmare to expand past the current 3 song implementaion. I could have taken some extra time and created a loop, but I had an abundance of other work that needed doing, and this was enough. 

The file first takes in the info in a series of 4 strings. I used a short, semi-modified segment of code that Keashav gave me to remove the colon from the mm:ss string and convert it into seconds. I did a quick line to average the times. I labled the variables and other required items for each song object with a suffix(Blank for song one, a "2" for song 2, and a "3" for song 3.) 

The code then uses some Math.abs() functions to find the playtime closest to 240 seconds. It combines the requirement to make a table and order them by length into one, using a massive if statement to print them out in order.

I had a bit of trouble near the end, as it seemed to be skipping over my sorting tree. In reality, I hadn't added the capability to deal with equal durations to my if tree, and my averaging code was malfunctioning and setting all the playtimes to the average of them. Other than that, the project went smoothly.

## Extra Credit

None.

## Sources used

I used the supplied song.java class, as well as a small section of code from Keashav, mentioned above.
