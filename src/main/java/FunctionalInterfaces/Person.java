package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    String lastName;
    int age;
    int countSon = 0;
    int countDaughter = 0;
    List<String> favoriteFoods = new ArrayList<>();

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public int getCountSon() {
        return countSon;
    }

    public void setCountSon(int countSon) {
        this.countSon = countSon;
    }

    public int getCountDaughter() {
        return countDaughter;
    }

    public void setCountDaughter(int countDaughter) {
        this.countDaughter = countDaughter;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static List<String> getFavoriteFoods1(){
        List<String> f = new ArrayList<>();
        f.add("Soup");
        f.add("Rice");
        return f;
    }

    public static List<String> getFavoriteFoods2(){
        List<String> f = new ArrayList<>();
        f.add("Hot dog");
        f.add("Coke");
        return f;
    }
    public static List<String> getFavoriteFoods3(){
        List<String> f = new ArrayList<>();
        f.add("Meat");
        f.add("Salad");
        return f;
    }

    public static List<String> getFavoriteFoods4(){
        List<String> f = new ArrayList<>();
        f.add("French fries");
        f.add("Ketchup");
        return f;
    }

    public static List<String> getFavoriteFoods5(){
        List<String> f = new ArrayList<>();
        f.add("Chicken");
        f.add("Sauce");
        return f;
    }
}
