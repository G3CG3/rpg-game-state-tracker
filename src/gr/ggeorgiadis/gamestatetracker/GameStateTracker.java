package gr.ggeorgiadis.gamestatetracker;

import java.util.EnumMap;

public class GameStateTracker {
    private EnumMap<GamePhase, String> gamePhases;

    public GameStateTracker() {
        gamePhases = new EnumMap<>(GamePhase.class);
        initializePhases();
    }

    public void initializePhases() {
        gamePhases.put(GamePhase.START, "Welcome to the RPG Game!");
        gamePhases.put(GamePhase.PLAYING, "The adventure begins...");
        gamePhases.put(GamePhase.PAUSE, "Game is paused. Take a break.");
        gamePhases.put(GamePhase.GAME_OVER, "Game over. Try again!");
    }

    public void printPhaseMessage(GamePhase phase) {
        String message = gamePhases.get(phase);
        System.out.println("[" + phase + "] " + message);
    }
}
