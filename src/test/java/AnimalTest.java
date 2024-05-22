import junit.framework.Assert;
import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalTest extends TestCase {

        public void testTestEquals() {
        }

        public void testTestHashCode() {
        }

        public void testTestToString() {
        }

        public void testGetAllAnimal(String type,String height,String weight) throws FileNotFoundException {
            Animal animal = new Animal(type,height,weight);
            ArrayList<Animal> expected = Animal.getAllAnimal(type,height,weight);
            List<Animal> actual = new ArrayList<>();
            actual.add(animal);
            Assert.assertEquals(expected, actual);
        }

        public void testGetAllUsers() {
        }

        public void testGetHowManyUsers() {
        }

        public void testTestGetHowManyUsers() {
        }
    }

