package src.iterations;

import java.io.*;

public class BinaryGap {
    public BinaryGap() {
    }

    public static void exercise() throws IOException {
        InputStream fis = new FileInputStream("binary-gap.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        int numSentences = Integer.parseInt(br.readLine());

        while(numSentences-- != 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(solution(n));
        }

    }

    public static int solution(int n) {
        String binaryN = Integer.toBinaryString(n);
        char[] y = binaryN.toCharArray();
        int result = 0;

        for(int i = 0; i < binaryN.length(); ++i) {
            int count = 0;
            if (y[i] == '1') {
                while(i < binaryN.length() - 1 && y[i + 1] == '0') {
                    ++count;
                    ++i;
                }

                if (count > result && i < binaryN.length() - 1 && y[i + 1] == '1') {
                    result = count;
                }
            }
        }

        return result;
    }
}
