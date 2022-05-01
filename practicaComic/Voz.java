package practicaComic;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import imonsh.Colors;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static practicaComic.Voz.TextToSpeech.pause;

public class Voz implements   Runnable{


    public void run() {

        new TextToSpeech ("I want to be a great");

        pause(2000);


        new TextToSpeech("Alex wants to play with his friends");
        pause(1500);
        new TextToSpeech("I'm bored");
        pause(1000);

        new TextToSpeech("I'm going to Nacho's house");
        pause(1500);
        new TextToSpeech("Come on. Let's play");

        new TextToSpeech("I can't. I'm playing the piano");

        new TextToSpeech("I want to be a great pianist!");
        pause(2500);
        new  TextToSpeech("I'm going to Rita's house.");
        pause(2500);
        new  TextToSpeech("Come on. Let's play outside." +
                "I can't. I'm playing the violin.");

        new TextToSpeech("I want to be a great violinist!");
       pause(3000);

        new TextToSpeech("I'm going to Tommy's house.");
        pause(2500);
        new TextToSpeech("Let's play in the park"+
                " I can't. I'm playing the cello.");
        pause(2000);
        new TextToSpeech("I want to be a great cellist");
       pause(3000);
        new TextToSpeech("I'm going to Silby's house");
        pause(1500);
         new TextToSpeech("I'm bored. Com' on! Let's play!"+
                 "I can't. I'm playing the bassoon");
        new TextToSpeech("I want to be a great bassoonist");
        pause(2500);
        new TextToSpeech("I'm going to go back home.");
        pause(3000);
        new TextToSpeech("I have a great idea!!!");
       pause(2500);
        new TextToSpeech("I'm playing the drums." +
                "I want to be a great percussionist!");
        pause(3000);
        new TextToSpeech("THE END");


    }



    public class TextToSpeech {
        //String voiceName = "kevin16";
        VoiceManager freeVM;
        Voice voice;
        public TextToSpeech(String words) {
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            voice = VoiceManager.getInstance().getVoice("kevin16");
            if (voice != null) {
                voice.allocate();// Allocating Voice
                try {
                    voice.setRate(130);// Setting the rate of the voice
                    voice.setPitch(150);// Setting the Pitch of the voice
                    voice.setVolume(3);// Setting the volume of the voice
                    SpeakText(words);// Calling speak() method

                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            } else {
                throw new IllegalStateException("Cannot find voice: kevin16");
            }
        }

        public void SpeakText(String words) {
            voice.speak(words);
        }

        static void pause(int i)
        {
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}}
