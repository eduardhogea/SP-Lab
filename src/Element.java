interface Element {

    void print();

    void add(Element element);

    void remove(Element element);

    public void accept(Visitor visitor);
}