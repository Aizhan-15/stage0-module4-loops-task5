package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int x = 0; x < length; x++) {
            for (int y = 0; y < height; y++) {
                System.out.println('8');
            }
            System.out.println('8');
        }
    }
}
