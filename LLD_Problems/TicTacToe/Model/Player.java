package Patterns.LLD_Problems.TicTacToe.Model;
public class Player {
    public String playerName;
    public PlayingPiece playingPiece;

    public Player(String playerName, PlayingPiece playingPiece) {
        this.playerName = playerName;
        this.playingPiece = playingPiece;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }




}
