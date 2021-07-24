import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle(1);
        drawCircle(2);
        drawCircle(3);
        drawCircle(4);
        x++;
    }

    private void drawCircle(int factor) {
        ellipse(getX(factor), getY(factor), DIAMETER, DIAMETER);
    }

    private int getX(int factor) {
        return x * factor;
    }

    private int getY(int factor) {
        return (factor * HEIGHT) / 5;
    }
}
