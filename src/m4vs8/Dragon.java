package m4vs8;

public class Dragon {
    private String name;

    public Dragon(String name) {
        this.name = name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Dragon(){
    }

    public void sayName() {
        System.out.println("Hello, my name is " + name);
    }
}
