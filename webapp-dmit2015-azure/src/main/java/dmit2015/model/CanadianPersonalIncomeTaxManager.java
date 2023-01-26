package dmit2015.model;

import java.nio.file.Path;

public class CanadianPersonalIncomeTaxManager {
    public static void main(String[] args) {
        Path csvPath = Path.of(Thread.currentThread().getContextClassLoader().getResource("data/CanadianPersonalIncomeTaxRates.csv").toURI());
    }
}
