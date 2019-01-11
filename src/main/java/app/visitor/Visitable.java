package app.visitor;

public interface Visitable {

    double accept(Visitor visitor);
}
