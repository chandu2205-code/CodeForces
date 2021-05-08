package com.codeforces;

import java.io.*;

/**
 * Problem statement for Codeforces Round #265 (Div.2) can be found here:
 * {@link https://codeforces.com/contest/465/problem/B}
 */
public class Inbox {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int letters = Integer.parseInt(br.readLine());
        String[] unformattedInput = br.readLine().split(" ");

        int[] letterStatus = new int[letters];
        for (int i=0;i<letters;i++) {
            letterStatus[i] = Integer.parseInt(unformattedInput[i]);
        }

        int prevLetter = -1;
        int occurrence = 0;
        for (int i=0;i<letterStatus.length;i++) {
            if (letterStatus[i] == 1) {
                occurrence++;
            } else if (letterStatus[i] == 0 && prevLetter == 1) {
                occurrence++;
            }
            prevLetter = letterStatus[i];
        }
        if (prevLetter == 0) {
            occurrence = Math.max(occurrence-1,0);
        }
        bw.write(occurrence+"\n");
        bw.flush();

    }
}

