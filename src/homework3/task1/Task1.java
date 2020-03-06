package homework3.task1;

public class Task1 {

    public static class Util {

        public static double getDistance(int x1, int y1, int x2, int y2) {

            return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        }
    }
}
