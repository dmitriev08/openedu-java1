package m4vs12;
public class Dragon extends Reptile implements Flying {
    private String name;
    @Override
    public void move (){
        System.out.println("Дракон ползет");
    }
    public Dragon(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Дракон полетел");
    }
}
