package m4vs6;

public class Dragon {
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    public Dragon(){
    }

    public void sayName() {
        System.out.println("Hello, my name is " + name);
    }
}
