import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AnimalTest extends TestCase {

    public void testTestEquals() {
    }

    public void testTestHashCode() {
    }

    public void testTestToString() {
    }

    public void testGetAllAnimal(String type,String height,String weight) throws FileNotFoundException {
       // создаем тестовые данные
        Animal animal = new Animal("Травоядное", "Высокое", "Тяжелое");
        Animal animal1 = new Animal("Плотоядное", "Невысокое", "Среднее");
        Animal animal2 = new Animal("Всеядное", "Маленькое", "Легкое");
        Animal animal3 = new Animal("Травоядное", "Высокое", "Тяжелое");
        Animal animal4 = new Animal("Травоядное", "Невысокое", "Легкое");
        Animal animal5 = new Animal("Всеядное", "Высокое", "Тяжелое");

        //создаем список expected и заполняем его данными нашего метода
        ArrayList<Animal> expected = Animal.getAllAnimal(type,height,weight);

        //создаем список actual в него помещаем данные для сравнения
        //то что мы предпологиаем метод должен вернуть
        List<Animal> actual = new ArrayList<>();
        actual.add(animal);
        actual.add(animal1);
        actual.add(animal2);

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

//   @ParameterizedTest
//    @CsvFileSource(resources = "/src/main/java/org.example/Animal",delimiter = ';',numLinesToSkip = 1)
//   public void testGetAllAnimal(String input,String expected){
//
//   }

    public void testGetAllUsers() {
    }

    public void testGetHowManyUsers() {
    }

    public void testTestGetHowManyUsers() {
    }
}