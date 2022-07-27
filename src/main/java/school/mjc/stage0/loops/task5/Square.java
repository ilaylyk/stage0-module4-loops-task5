package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        int m = 1;
        int z = 1;
        int x = 1;
        int r;

        while (m <= sideLength) {
            r = 1;
            if (m == 1) {
                while (z <= sideLength) {
                    System.out.print(8);
                    z += 1;
                }
                System.out.print("\n");
            }

            if (m != 1 && m != sideLength) {
                System.out.print(8);
                while (r <= sideLength - 2) {
                    System.out.print(" ");
                    r += 1;
                }
                System.out.print(8 + "\n");
            }

            if (m == sideLength) {
                while (x <= sideLength) {
                    System.out.print(8);
                    x += 1;
                }
            }
            m += 1;
        }
        if (sideLength != 0){
            System.out.println();
        }
    }
}
