package Part1;
import java.util.Scanner;  



public class CeasarCipher {  

public static void main(String[] args) { 

 

int shift =5;// the algorithm shifts 

char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //to know the order of alphabets 

char[] alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); 

System.out.println("Enter your message :"); 

Scanner sc = new Scanner(System.in); 

String message=sc.nextLine();// take the message from the user 

sc.close(); 

char[] messageChar = message.toCharArray();// convert the message to array of characters 

 

for(int i =0;i<message.length();i++) {// convert to secured message 

char test = message.charAt(i); //select a character from the message 

 

for(int j=0;j<26;j++) { 

 

if(test==alphabet1[j]) { //find the character order if it is big letter 

int newIndex = (j+shift)%26; // add the shift  

messageChar[i] = alphabet1[newIndex]; // change the character with the new one 

} 

 

if(test==alphabet[j]) { //find the character order if it is small letter 

int newIndex = (j+shift)%26; // add the shift 

messageChar[i] = alphabet[newIndex]; // change the character with the new one  

}}} 

 

message = String.valueOf(messageChar); // change the array of char to string 

System.out.println("Your message in secure form :"); 

System.out.println(message); // print the secured value 

 

for(int i =0;i<message.length();i++) { // change it to its original value 

char test = message.charAt(i); // select a character from the message 

 

for(int j=0;j<26;j++) { 

if(test==alphabet1[j]) { //find the character order if it is big letter 

 

int newIndex=0; 

newIndex=(j-shift)%26;//subtract the shift 

int check = newIndex;// in case it was negative 

 

if(newIndex<0) {//if negative 

newIndex = 26 -Math.abs(check);}//subtract the absolute of index from 26 

messageChar[i] = alphabet1[newIndex]; // change the character with the new one 

} 

 

if(test==alphabet[j]) { //find the character order if it is small letter 

int newIndex=0; 

newIndex=(j-shift)%26; //subtract the shift 

int check = newIndex;// in case it was negative 

 

if(newIndex<0) {//if negative 

newIndex = 26 -Math.abs(check);}//subtract the absolute of index from 26 

messageChar[i] = alphabet[newIndex]; // change the character with the new one 

}}} 

 

message = String.valueOf(messageChar); // change the array of char to string 

System.out.println("The original form of message :"); 

System.out.println(message); // print the secured value 

}} 