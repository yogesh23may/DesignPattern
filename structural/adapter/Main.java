/*
 * Adapter pattern works as a bridge between two incompatible interfaces.
 * This pattern involves a single class which is responsible to join functionalities of independent 
 * or incompatible interfaces
 */
package adapter;
public class Main {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3","rivendell.mp3");
		audioPlayer.play("mp4","gunsNroses.mp4");
		audioPlayer.play("vlc", "metallica.vlc");
		audioPlayer.play("kmp","rihanna.kmp");
	}
}
