package m3vs9;
public class MyList {
    Element head = null;
    public void add(Element newElement) {
        Element tmp = head;
        head = newElement;
        newElement.next = tmp;
    }
    public int getSize(){
        var size = 0;
        Element tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        return size;
    }

    public void showAll(){
        Element tmp = head;
        while (tmp != null) {
            System.out.println(">>" + tmp.name);
            tmp = tmp.next;
        }
    }
}
