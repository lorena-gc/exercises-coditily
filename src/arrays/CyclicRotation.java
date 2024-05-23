package src.arrays;

import java.io.*;
import java.util.Arrays;

public class CyclicRotation {
    public CyclicRotation() {
    }

    public static void exercise() throws IOException {
        InputStream fis = new FileInputStream("cyclic-rotation.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        int[] a = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(br.readLine());
        int[] result = solution(a, k);
        System.out.print("[");

        for(int i = 0; i < result.length; ++i) {
            if (i == result.length - 1) {
                System.out.print(result[i] + "]");
            } else {
                System.out.print(result[i] + ", ");
            }
        }

    }

    private static int[] solution(int[] a, int k) {
        int n = a.length;
        int[] result = new int[n];
        if (n != 0) {
            while(k > n) {
                k -= n;
            }
        }

        for(int i = 0; i < n; ++i) {
            int j = 0;
            if (i + k < n) {
                result[i + k] = a[i];
            } else {
                while(i < n) {
                    result[j] = a[i];
                    ++j;
                    ++i;
                }
            }
        }

        return result;
    }
}
