package practice;

import java.util.Set;
import java.util.TreeSet;

public class Overloading {
    public static void main(String[] args) {
        Student student1 = new Student(1, "pimonov","kostya", "viacheslavovich"
                , "19.02.1996", "Kharkiv", "+380901323", "hueta", 4, "pizdez");
        Student student2 = new Student(2, "sad", "name", "polindromovich",
                "31.01.2991", "zalup9nsk", "88005553535", "pnh", 99, "zalupa");
        Student student3 = new Student(3, "khmelnizkiy", "bogdan", "ivanovich",
                "11.09.2001", "london", "+39019132", "govna", 999, "huesosov");
        Student student4 = new Student(10, "AAAAAAAAAAAA", "aaaaaa", "sadas",
                "za wooo", "BLJDAT", "101", "powel", 2, "her");
        Student student5 = new Student(-5, "sdasd", "dsafsd", "fag", "nig",
                "trap", "eto", "pizdez", 4, "lohov");
        Set set1 = new TreeSet();
        set1.add(student1);
        set1.add(student2);
        set1.add(student3);
        set1.add(student4);
        set1.add(student5);

        for(Object o: set1){
            System.out.println(o);
        }

        Product product = new Product(25, "izdez", "pidor", 25.10, "poka ne sdohnesh", 99999);
        Product product1 = new Product(25, "izdez", "pidor", 25.10, "poka ne sdohnesh", 99999);
        Product product2 = new Product(31, "s", "novum", 44.55, "2020", 66);
        Product product3 = new Product(-19, "suka", "blyat", 66.77, "2021", 10);
        Product product4 = new Product(10, "govnoedov", "is", 10.00, "xD", 10);

        Set set = new TreeSet();
        set.add(product);
        set.add(product1);
        set.add(product2);
        set.add(product3);
        set.add(product4);

        for(Object xD: set){
            System.out.println(xD);
        }
    }













//    Всем доброе утро!
//    Ваше задание на практику
//    Класс Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа
//    Класс Product: id, Наименование, Производитель, Цена, Срок хранения, Количество
//    Класс House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Город, Срок эксплуатации
//    Класс Book: id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена
//
//1. Создать классы, спецификации которых приведены выше.
//2. Переопределить методы toString(), equals(), hashCode().
//            3. Создать несколько (не менее 5) объектов каждого из классов.
//            4. Отсортировать объекты Student по любому из полей, используя Comparable.
//            5. Отсортировать объекты Product по любому из нескольким полям, используя Comparable.
//6. Отсортировать объекты House по любому из полей, используя Comparator.
//            7. Отсортировать объекты Book по любому из нескольким полям, используя Comparator.
}
