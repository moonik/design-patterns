package app.visitor;

public class TaxVisitor implements Visitor {

    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquor price with tax: ");
        return liquor.getPrice()*.18 + liquor.getPrice();
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco price with tax: ");
        return tobacco.getPrice()*.32 + tobacco.getPrice();
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity price with tax: ");
        return necessity.getPrice();
    }
}
