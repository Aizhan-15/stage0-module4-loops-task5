package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int r = 1; r <= cathetusLength; r++) {
            for (int j = 1; j <= r; j++) {
                System.out.println(j);
            }
        }
    }
}

