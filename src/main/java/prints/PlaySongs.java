package prints;

public class PlaySongs {

    public void playSomeTunes(Genre genre){
        switch (genre){
            case METAL:
                System.out.println("Play Seasons in the Abyss");
                break;
            case PROGRESSIVE:
                System.out.println("Play The Doomed");
                break;
            default:
                System.out.println("No track yet");
        }
    }
}
