package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == length - 1) {
                    System.out.print("8");
                } else {
                    if (j == 0 || j == length - 1) {
                        System.out.print("8");
                    } else {
                        System.out.println(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
