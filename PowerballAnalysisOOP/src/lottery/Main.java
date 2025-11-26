package lottery;

import lottery.model.NumberFrequency;
import lottery.service.PowerballDataLoader;
import lottery.service.PowerballAnalysisService;

public class Main {
    public static void main(String[] args) {

        PowerballDataLoader loader = new PowerballDataLoader();
        PowerballAnalysisService service = new PowerballAnalysisService(loader.loadFrequencies());

        System.out.println("Top 3 numbers for pick 1:");
        for (NumberFrequency nf : service.getTopNumbers(1, 3)) {
            System.out.println(nf);
        }

        System.out.println("\nTop 3 numbers for pick 2:");
        for (NumberFrequency nf : service.getTopNumbers(2, 3)) {
            System.out.println(nf);
        }
    }
}