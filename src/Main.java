public class Main {
    public static void main(String[] args) {

//        Cat lui = new Cat("Луи", 6, 4.5);
//        Cat barry = new Cat("Барри", 5, 4.2);

//        lui.meow();
//        barry.meow();
//        lui.name();
//        lui.eat("Рыба");
//        lui.eat("Огурец");
//
//        barry.name();
//        barry.eat("Мясо");
//        Cat lui = new Cat();
//        lui.name = "Луи";
//        lui.age = 6;
//        lui.weight = 4.5;

//        System.out.println("Имя кота: " + lui.name + ", " + "возраст кота: " + lui.age + ", " + "вес кота: " + lui.weight + " кг");

//        Cat anotherCat = new Cat();
//        anotherCat.name = "Барри";
//        anotherCat.age = 3;
//        anotherCat.weight = 4.2;

//        System.out.println("Имя кота: " + barry.name + ", " + "возраст кота: " + barry.age + ", " + "вес кота: " + barry.weight + " кг");
//        barry.age++;
//        System.out.println("Возраст кота увеличелся на одни год и теперь ему " + barry.age);

//        String catName;
//        catName = "Луи";
//        int catAge = 6;
//        double catWeight = 4.5;
//
//        String otherCatName = "Барри";
//        int otherCatAge = 3;
//        double otherCatWeight = 4.5;

//        System.out.println("Моего бывшего кота зовут " + catName);
//        System.out.println("Коту наверное " + catAge + " лет");
//        System.out.println("Мой бывший кот весит " + catWeight + " кг");
//
//        catAge += 1;
//        System.out.println("Теперь моему бывшему коту " + catAge + " лет");
//
//        System.out.println("Другого кота зовут " + otherCatName);
//        System.out.println("Возраст другого кота " + otherCatAge + " лет");
//        System.out.println("Вес другого кота " + otherCatWeight + " кг");
//
//        otherCatWeight += 1;
//        System.out.println("Кот по имени " + otherCatName + " стал весить" + otherCatWeight + " кг");

//        int age = 13;
//        if (age >= 18) {
//            System.out.println("Продано!");
//        } else {
//            System.out.println("Продажа ограничена до 18 лет!");
//            System.out.println("Тебе только " + age + " лет");
//        }

//        while (age < 18) {
//            System.out.println("Ты еще мал!");
//            System.out.println("Тебе всего " + age);
//            System.out.println("Прошел год");
//            age++;
//            if (age == 18) {
//                System.out.println("Тебе 18! Продаем!");
//            }
//        }

        Math math = new Math();
        int base = 2;
        int exponet = 10;
        int answer = math.power(base,exponet);
//        System.out.println(answer);
        System.out.println("2^10 = " + answer);

    }
}