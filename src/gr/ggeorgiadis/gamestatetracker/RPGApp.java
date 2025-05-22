package gr.ggeorgiadis.gamestatetracker;

public class RPGApp {
    public static void main(String[] args) {
        GameStateTracker tracker = new GameStateTracker();

        tracker.printPhaseMessage(GamePhase.START);
        tracker.printPhaseMessage(GamePhase.PLAYING);
        tracker.printPhaseMessage(GamePhase.PAUSE);
        tracker.printPhaseMessage(GamePhase.GAME_OVER);
    }
}
