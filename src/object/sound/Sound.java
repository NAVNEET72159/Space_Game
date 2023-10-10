/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.sound;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Navneet
 */
public class Sound {
    private final URL shoot;
    private final URL hit;
    private final URL destroy;

    public Sound() {
        this.shoot = this.getClass().getClassLoader().getResource("object//sound//shoot.wav");
        this.hit = this.getClass().getClassLoader().getResource("object//sound//hit.wav");
        this.destroy = this.getClass().getClassLoader().getResource("object//sound//destroy.wav");
    }

    public void soundShoot() {
        play(shoot);
    }

    public void soundHit() {
        play(hit);
    }

    public void soundDestroy() {
        play(destroy);
    }

    private void play(URL url) {
        try {
            Clip clip;
            try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(url)) {
                clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.addLineListener((LineEvent event) -> {
                    if (event.getType() == LineEvent.Type.STOP) {
                        clip.close();
                    }
                });
            }
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.err.println(e);
        }
    }
}
