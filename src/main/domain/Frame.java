package main.domain;

public class Frame {

    private static final int TOTAL_FRAME = 10;
    private static final int NORMAL_FRAME_TURN = 2;
    private static final int FINAL_FRAME_TURN = 3;
    private static final int TOTAL_PIN = 10;

    private int turn;

    public Frame(int frameNumber) {
        turn = NORMAL_FRAME_TURN;
        if (frameNumber == TOTAL_FRAME) {
            turn = FINAL_FRAME_TURN;
        }
    }

    private void calculateScore(int pinCount) {
        if (pinCount == TOTAL_PIN) {
            turn -= 2;
        }
        turn--;
    }

    private boolean hasTurn() {
        return turn > 0;
    }

}
