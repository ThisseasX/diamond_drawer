package diamond_drawer;

import utils.MirrorLooper;

public class Mirrored {

    public static void main(String[] args) {
        drawDiamond(7);
    }

    private static void drawLine(int length, int starPosition) {
        MirrorLooper.loop(
                1,
                length,
                i -> System.out.print(i == starPosition ? '*' : '.'),
                System.out::println
        );
    }

    private static void drawDiamond(int length) {
        MirrorLooper.loop(
                length,
                1,
                i -> drawLine(length, i),
                null
        );
    }
}
