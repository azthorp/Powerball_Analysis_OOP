package lottery.service;

import java.io.*;
import java.util.*;

public class PowerballDataLoader {

    public Map<Integer, Integer>[] loadFrequencies() {
        Map<Integer, Integer>[] positionFreq = new HashMap[5];
        for (int i = 0; i < 5; i++) {
            positionFreq[i] = new HashMap<>();
        }

        try (InputStream input = getClass().getResourceAsStream("/Powerball_Winning_Numbers.csv");
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {

            String line = reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if (row.length < 2) continue;

                String[] numbers = row[1].trim().split(" ");
                if (numbers.length < 5) continue;

                for (int i = 0; i < 5; i++) {
                    int n = Integer.parseInt(numbers[i].trim());
                    positionFreq[i].put(n, positionFreq[i].getOrDefault(n, 0) + 1);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return positionFreq;
    }
}