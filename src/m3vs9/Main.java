package m3vs9;
public class Main {
    public static void main(String[] args) {
        Element e1 = new Element("Andrey");
        Element e2 = new Element("Maxim");
        Element e3 = new Element("Galina");
        MyList list = new MyList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        System.out.println("Size == " + list.getSize());
        list.showAll();
    }
}