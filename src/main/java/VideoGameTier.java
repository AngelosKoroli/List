public class VideoGameTier {
    private int Position;
    private String Game;
    private String PlayableCharacter;
    private String MainVillain;
    private int Released;


    public int getPosition() {
        return Position;
    }

    public void setClass(int aPosition) {
        Position = aPosition;
    }

    public String getGame() {
        return Game;
    }

    public void setGame(String game) {
        Game = game;
    }

    public String getPlayableCharacter() {
        return PlayableCharacter;
    }

    public void setPlayableCharacter(String playableCharacter) {
        PlayableCharacter = playableCharacter;
    }

    public String getMainVillain() {
        return MainVillain;
    }

    public void setMainVillain(String mainVillain) {
        MainVillain = mainVillain;
    }

    public int getReleased() {
        return Released;
    }

    public void setReleased(int released) {
        Released = released;
    }

    public VideoGameTier(int Position, String Game, String PlayableCharacter, String MainVillain, int Released) {
        this.Position = Position;
        this.Game = Game;
        this.PlayableCharacter = PlayableCharacter;
        this.MainVillain = MainVillain;
        this.Released = Released;


    }}
