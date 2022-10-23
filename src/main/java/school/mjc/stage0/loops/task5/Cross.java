package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            Cross cross = new Cross();
            cross.printCross(i);
        }
    }
}
