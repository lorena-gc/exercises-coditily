package src.arrays;

import java.io.*;
import java.util.Arrays;

public class OddOccurrencesInArray {
    public OddOccurrencesInArray() {
    }

    public static void exercise() throws IOException {
        InputStream fis = new FileInputStream("oddOccurrences.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        int[] A = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int result = solution(A);
        System.out.println(result);
    }

    private static int solution(int[] A) {
        int n = A.length;
        int result = 0;

        for(int i = 0; i < n; ++i) {
            int count = 0;

            for(int j = 0; j < n; ++j) {
                if (A[i] == A[j]) {
                    ++count;
                }
            }

            if (count % 2 != 0) {
                result = A[i];
            }
        }

        return result;
    }
}
