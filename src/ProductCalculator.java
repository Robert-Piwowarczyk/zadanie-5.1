public class ProductCalculator {
    public static void main(String[] args) {
        Product product1 = new Product("radio"
                , "radio z zegarem cyfrowym"
                , "RTV");

        Product product2 = new Product("czekolada"
                , "czekolada Milka z orzechami waga 100g"
                , "produkt spożywczy");

        String category = "radio";

        switch (category) {
            case "radio":
                System.out.println("kategoria tego produktu to: RTV");
                System.out.println("Produkt: " + product1.getName()
                        + "; Opis produktu: " + product1.getDescription() + "; cena brutto: "
                        + product1.grossPriceRtv(55.80) + "zł");
                break;
            case "czekolada":
                System.out.println("kategoria tego produktu to: spożywka");
                System.out.println("Produkt: " + product2.getName() + "; Opis produktu: "
                        + product2.getDescription() + "; cena brutto: "
                        + product2.grossPriceFood(4.90) + "zł");
                break;
            default:
                System.out.println("kategoria produktu: nieznana, wprowadź poprawną nazwę produktu");
        }
    }
}

