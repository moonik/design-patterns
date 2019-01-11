package app.visitor;

public class Application {

    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Necessity bread = new Necessity(.99);
        Liquor vodka = new Liquor(19.99);
        Tobacco cigars = new Tobacco(25.99);

        System.out.println("With tax visitor:");
        System.out.println(bread.accept(taxVisitor));
        System.out.println(vodka.accept(taxVisitor));
        System.out.println(cigars.accept(taxVisitor));

        System.out.println("With tax holiday visitor:");
        System.out.println(bread.accept(taxHolidayVisitor));
        System.out.println(vodka.accept(taxHolidayVisitor));
        System.out.println(cigars.accept(taxHolidayVisitor));
    }
}
