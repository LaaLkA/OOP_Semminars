package Main.clients.old;

public class Owner {
    String name;

    public Owner(String name) {
        this.name = name;
    }
    public Owner(){
        this("Хозяин");
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }
}
