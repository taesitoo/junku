package Examenomega;

import java.io.*;

public class problemad {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        
        StringBuilder sb = new StringBuilder();
        int contador = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) sb.append(' ');
                sb.append(contador++);
            }
            if (i < n) sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}
