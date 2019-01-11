package app.visitor;

public interface Visitor {

    /*
      items should taxed in different ways
     */
    double visit(Liquor liquor);
    double visit(Tobacco tobacco);
    double visit(Necessity necessity);
}
