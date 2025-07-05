
interface MusicPlayer{
    void play();
    void stop();
    void change();
}

class Spotify implements MusicPlayer{
    public void play(){
        System.out.println("Spotify playing music");
    }
    public void stop(){
        System.out.println("Spotify stopping music");
    }
    public void  change(){
        System.out.println("Spotify changing music");
    }
    public void follow(){
        System.out.println("Spotify following artist");
    }
}

class YtMusic implements MusicPlayer{
    public void play(){
        System.out.println("YtMusic playing music");
    }
    public void stop(){
        System.out.println("YtMusic stopping music");
    }
    public void change(){
        System.out.println("YtMusic changing music");
    }
    public void video(){
        System.out.println("ytMusic playing music video");
    }
}
public class MusicPlayerInterface{
    
    public static void main(String[] args) {
        MusicPlayer spfy = new Spotify();
        spfy.play();
        spfy.change();
        spfy.stop();
    }
    
}
