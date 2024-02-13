//package Sem1.clients;
//
//import Sem1.*;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        Animal cat = new Cat("Sunny", new Owner("Nick"),
//                LocalDate.of(2021, 10, 5), new Illness("herpes"), 10D); // created an animal "cat"
////        System.out.println(cat.getOwner());
////        System.out.println(cat.getNickname());
////        cat.setIllness(new Illness("herpes"));
////        System.out.println(cat.getIllness());
////
////        System.out.println(cat.getType());
////
////        System.out.println(cat);
//
//        Animal catty = new Cat();
//        Dog goodBoy = new Dog();
//
//        System.out.println(goodBoy.getType());
//        System.out.println(catty.getType());
//
//        System.out.println(goodBoy);
//        System.out.println(catty);
//
//        Cat.meow();
//
//        List<Animal> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(catty);
//        animals.add(goodBoy);
//
//        int index = 0;
//        for (Animal animal : animals) {
//            index++;
//            System.out.println(index + " " + animal);
//        }
//
//        Animal duck = new Duck();
//        Animal fish = new Fish();
//        System.out.println(duck);
//        System.out.println(fish);
//        duck.toGo();
//        duck.fly();
//        duck.swim();
//        fish.toGo();
//        fish.fly();
//        fish.swim();
//    }
//}
