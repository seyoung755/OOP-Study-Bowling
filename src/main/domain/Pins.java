package main.domain;

public class Pins {

    private final static int MAX_BOWLING_PINS = 10;
    private int bowlingPins;

    public Pins() {
        this.bowlingPins = MAX_BOWLING_PINS;
    }

    public void rollingBall() {
        int randomNumber = (int) (Math.random() * MAX_BOWLING_PINS);
        hitBowlingPin(randomNumber);
    }
    private void hitBowlingPin(int hitBowlingPinCount) {
        this.bowlingPins -= hitBowlingPinCount;
    }
}
