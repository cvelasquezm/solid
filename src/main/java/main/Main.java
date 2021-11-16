package main;

import FunctionalInterfaces.Person;
import FunctionalInterfaces.Square;
import solid.Button;
import solid.common.ConventionalDoor;
import solid.common.Door;
import solid.common.ElectronicDoor;
import solid.common.SecurityDoor;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        Square square = (int x) -> Math.sqrt(x);
        calculateArea(square);
    }

    private static void calculateArea(Square square){
        square.getArea(5);
    }

    private static void wordCounter() {
        String word = "ana pap  sadasd       sdasdsadasd";
        System.out.println("--------------------------------------------------");
        System.out.println("Inicio Contador de Palabras");

        System.out.println(word.split("\\s+").length);
        System.out.println("Fin Contador de Palabras");
    }

    private static void OddOccurs() {
        Integer[] numbers = new Integer[]{1,2,3,2,1,7,7,7};
        Integer[] distinctNumber = Stream.of(numbers).distinct().toArray(Integer[]::new);
        for (int i = 0; i < distinctNumber.length; i++){
            if(isOdd(getOccurs(numbers, distinctNumber[i]))){
                System.out.println(distinctNumber[i] + " has odd occurs");
            }
        }
    }

    private static void palindrome() {
        String word = "";
        String r = new StringBuilder(word).reverse().toString();
        if (word.equals(r)){
            System.out.println("IsPalindromo");
        }else{
            System.out.println("Is Not Palindromo");
        }
    }

    private static boolean anagramJava8() {
        String hello = "hello";
        String holle = "hollze";

        if (hello.length() != holle.length()){
            System.out.println("No es anagrama");
            return true;
        }

        char[] a = hello.toCharArray();
        char[] b = holle.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                System.out.println("No es anagrama");
                return true;
            }
        }
        System.out.println("SI es anagrama");
        return false;
    }

    private static void java8() {
        //Java 8 - Stream, forEach, filter,
        System.out.println("------------------------------------------");
        System.out.println("Java 8");
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Cesar", "Velasquez", 29);
        Person person2 = new Person("Leaniceth", "Quintana", 29);
        Person person3 = new Person("Amanda", "Velasquez", 3);
        Person person4 = new Person("Astrid", "Martinez", 50);
        Person person5 = new Person("Wilmer", "Velasquez", 52);
        person1.setCountDaughter(1);
        person2.setCountDaughter(1);
        person4.setCountDaughter(1);
        person4.setCountSon(1);
        person5.setCountDaughter(1);
        person5.setCountSon(1);
        person1.setFavoriteFoods(Person.getFavoriteFoods1());
        person2.setFavoriteFoods(Person.getFavoriteFoods2());
        person3.setFavoriteFoods(Person.getFavoriteFoods3());
        person4.setFavoriteFoods(Person.getFavoriteFoods4());
        person5.setFavoriteFoods(Person.getFavoriteFoods5());

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        Predicate<Person> predicate = p -> p.getName().startsWith("A") && p.getAge() > 2;
        System.out.println("-------------------");
        people.stream().filter(predicate).map(p -> p.getName().toUpperCase()).forEach(System.out::println);

        System.out.println("-------------------");
        people.stream().map(p -> p.getName().toLowerCase()).forEach(System.out::println);
        System.out.println("--------------------------");
        people.stream().flatMap(p -> Stream.of(p.getFavoriteFoods())).forEach(System.out::println);
    }

    private static void functionalInterfaces() {
        //I define the behaviour of the function and run it with the params

    }

    public static void solidPrinciples(){
        //Open-Close
        Button button = new Button();
        List<Door> listDoor = new ArrayList<Door>();
        listDoor.add(new ConventionalDoor());
        listDoor.add(new ElectronicDoor());
        listDoor.add(new SecurityDoor());

        listDoor = listDoor.stream().filter(d -> !d.isOpen()).collect(Collectors.toList());


        System.out.println("Open Close Principle SOLID");
        listDoor.forEach(door -> {
            button.press(door);
            button.press(door);
        });
    }

    public static long getOccurs(Integer[] listNumbers, Integer value){
        return Stream.of(listNumbers).filter(n -> n == value).count();
    }

    public static boolean isOdd(long number){
        return number % 2 != 0;
    }
}
