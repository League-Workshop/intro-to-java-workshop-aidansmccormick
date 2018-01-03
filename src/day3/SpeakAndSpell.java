package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
String word = JOptionPane.showInputDialog("Spell This");
		// 3. If the user spelled the word correctly, speak "correct"

	

if(word.equals("mandlebrot")) speak("WINNER");
else speak ("loser");
		// 5. repeat the process for other words
speak("spell endoplasmic reticulum");		
String the = JOptionPane.showInputDialog("Spell This");
	if(word.equals("endoplasmic recticlum"))speak("WINNER");
	else speak("loser");
	}

	static void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
		catch (Exception e){
e.printStackTrace();
}
}
}


