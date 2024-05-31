package src.timeComplexity;

import java.io.*;

/**
 * FrogJmp
 *
 * Goal: Count minimal number of jumps from position X to Y. The small frog always jumps a fixed distance, D.
 */
public class FrogJmp {

    public static void exercise() throws IOException {
        InputStream fis = new FileInputStream("frogJmp.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        int initialPosition = Integer.parseInt(br.readLine());
        int finishPosition =  Integer.parseInt(br.readLine());
        int jump = Integer.parseInt(br.readLine());

        System.out.println(solution(initialPosition, finishPosition,jump));
    }

    public static int solution(int X, int Y, int D){
        double x = X;
        double y = Y;

        double jumps = (y-x)/D;

        return jumps - (int) jumps > 0 ? (int)jumps + 1 : (int) jumps;

    }
}
