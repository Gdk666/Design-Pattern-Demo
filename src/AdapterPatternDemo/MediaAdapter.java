package AdapterPatternDemo;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new vlcPlay();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new mp4Play();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playMp4(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playVlc(fileName);
        }

    }
}
