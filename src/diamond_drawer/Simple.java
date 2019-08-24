package diamond_drawer;

public class Simple {

    public static void main(String[] args) {
        drawDiamond(7);
    }

    private static void drawDiamond(int length) {
        int i = length;
        int step = -1;

        while (i <= length) {
            drawLine(length, i);

            if (i == 1) {
                step = 1;
            }

            i += step;
        }
    }

    private static void drawLine(int length, int starPosition) {
        int i = 1;
        int step = 1;

        while (i >= 1) {
            System.out.print(i == starPosition ? "*" : '.');

            if (i == length) {
                step = -1;
            }

            i += step;
        }

        System.out.println();
    }
}
