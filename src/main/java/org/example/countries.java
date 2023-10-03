package org.example;

public class countries {
    private String capital;
    private long population;


    public countries(String capital, long population) {
        this.capital = capital;
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "countries{" +
                "capital='" + capital + '\'' +
                ", population=" + population +
                '}';
    }

    public static void main(String[] args) {
//        java.util.HashMap<String, String> countries = new java.util.HashMap<>();
//
//        countries.put("Afghanistan", "Kabul");
//        countries.put("Oman", "Muscat");
//        countries.put("Saudi Arabia", "Riyadh");
//        countries.put("Tanzania", "Dar es salam");
//        countries.put("Thailand", "Bangkok");
//        countries.put("United Arab Emirates", "Abu Dhabi");
//        countries.put("United Kingdom", "London");
//        countries.put("United States", "Washington DC");
//        countries.put("Uruguay", "Montevideo");
//        countries.put("Venezuela", "Caracas");
//        countries.put("Yemen", "Sana'a");

        java.util.HashMap<String, countries> countryMap = new java.util.HashMap<>();

        countries SaudiArabia = new countries("Riyadh", 1387297452);
        countries Oman = new countries("Muscat", 2351627);
        countries Japan = new countries("Tokyo", 126476461);

        countryMap.put("Saudi Arabia", SaudiArabia);
        countryMap.put("Oman", Oman);
        countryMap.put("Japan", Japan);

        //System.out.println(countryMap);
        System.out.println(countryMap.get("Saudi Arabia").getCapital());
        System.out.println(countryMap.get("Oman").getCapital());
        System.out.println(countryMap.get("Japan").getCapital());

        System.out.println();

        System.out.println(countryMap.get("Saudi Arabia").getPopulation());
        System.out.println(countryMap.get("Oman").getPopulation());
        System.out.println(countryMap.get("Japan").getPopulation());

        System.out.println();

        countryMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value.toString()); // to print all the values
        });

    }
}