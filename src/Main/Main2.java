package Main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<Goable>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        list.add(cat);
        list.add(dog);
        System.out.println(list);

        Animal animal = new Animal() {
            // Ссылка "animal" на класс. Всё внутри фигурных скобок является анонимным классом
            @Override
            public void eat() {

            }
        };
    }
}
