public class Cat {
    String name;
    int age;
    double weight;

    public Cat(String newName, int newAge, double newWeight) {
        name = newName;
        age = newAge;
        weight = newWeight;
    }

    public void meow() {
        System.out.println("Мяу, меня зовут " + name);
    }

    public void eat(String treat) {
        if (treat == "Мясо") {
            System.out.println("Спасибо друг за угощение! " + treat + " - вкусненько!");
        } else if (treat == "Рыба") {
            System.out.println("Спасибо друг за угощение! " + treat + " - обожаю!");
        } else {
            System.out.println(treat + " - неа, это не то! 😀");
        }
    }

    public void name() {
        System.out.println(name);
    }
}
