package utils;

import com.sun.istack.internal.NotNull;

import java.util.function.Consumer;

public class MirrorLooper {

    public static void loop(int start, int end, @NotNull Consumer<Integer> action, Runnable afterEffect) {
        int i = start;
        boolean rebound = false;
        int step = start > end
                ? -1
                : 1;

        while (true) {
            action.accept(i);

            if (i == end && !rebound) {
                rebound = true;
                step *= -1;
            } else if (i == start && rebound) {
                break;
            }

            i += step;
        }

        if (afterEffect != null) {
            afterEffect.run();
        }
    }

    public static void loop(int start, int end, @NotNull Consumer<Integer> action) {
        loop(start, end, action, null);
    }
}
