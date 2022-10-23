package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            if (i == 3) {
                System.out.print('88888');
            }
            System.out.println('8');
        }
    }
}
