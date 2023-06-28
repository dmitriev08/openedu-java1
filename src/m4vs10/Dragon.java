package m4vs10;
public class Dragon extends Reptile {
    private String name;
    @Override
    public void move (){
        System.out.println("Дракон ползет");
    }
    public Dragon(String name) {
        this.name = name;
    }

}
