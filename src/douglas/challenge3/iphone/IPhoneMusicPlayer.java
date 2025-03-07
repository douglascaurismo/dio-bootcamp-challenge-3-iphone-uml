package douglas.challenge3.iphone;

import douglas.challenge3.MusicPlayer;

public class IPhoneMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void selectSong(String song) {
        System.out.println("select song " + song);
    }
}
