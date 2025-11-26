package lottery.service;

import lottery.model.NumberFrequency;

import java.util.*;

public class PowerballAnalysisService {

    private final Map<Integer, Integer>[] frequencyData;

    public PowerballAnalysisService(Map<Integer, Integer>[] frequencyData) {
        this.frequencyData = frequencyData;
    }

    public List<NumberFrequency> getTopNumbers(int pickPosition, int topN) {
        Map<Integer, Integer> freqMap = frequencyData[pickPosition - 1];

        return freqMap.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(topN)
                .map(e -> new NumberFrequency(e.getKey(), e.getValue()))
                .toList();
    }
}
