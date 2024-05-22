import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Animal {

        private String weight;
        private String height;
        private String type;

        private static Map<String, Animal> allAnimal;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return type == animal.type &&
                    Objects.equals(type, animal.type);
        }

        @Override
        public int hashCode() {

            return Objects.hash(type,height);
        }
        public Animal(String type, String height, String weight) {
            if (allAnimal == null){
                allAnimal = new HashMap<>();
            }

            this.type = type;
            this.height = height;
            this.weight = weight;

        }
        private boolean hasAnimal(){
            for (Animal animal : allAnimal.values()){
                if (animal.equals(this) && animal.hashCode() == this.hashCode()){
                    return true;
                }
            }
            return false;
        }
        @Override
        public String toString() {
            return "Animal{" +
                    "type=" + type+
                    ", height='" + height + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        public static ArrayList<Animal> getAllAnimal(String type, String height, String weight) throws FileNotFoundException{
            File animal_file = new File("src\\main\\java\\org.example\\Animal");
            ArrayList<Animal> animal = new ArrayList<>();
            if (animal_file.exists()) {
                Scanner s = new Scanner(animal_file);
                String line;
                int herbivores1 = 0;
                int herbivoresOrCarnivorousAndMini = 0;
                int omnivorous = 0;
                if (s.hasNext()) {
                    String[] arr1;
                    while (s.hasNext()) {
                        line = s.nextLine();
                        arr1 = line.split(",");
                        Animal h = new Animal(type,height,weight);
                        h.type = arr1[0];
                        h.height=arr1[1];
                        h.weight=arr1[2];
                        animal.add(h);
                        for (int i = 0; type.equals("Травоядное") && i < arr1.length; i++) {
                            herbivores1++;
                            break;
                        }
                        for (int i = 0; (type.equals("Травоядное") || type.equals("Плотоядное")) && height.equals("Маленькое") && i < arr1.length; i++) {
                            herbivoresOrCarnivorousAndMini++;
                            break;
                        }
                        for (int i = 0; type.equals("Всеядное") && !height.equals("Высокое") && i < arr1.length; i++) {
                            omnivorous++;
                            break;
                        }
                        System.out.println("Травоядных животных: " + herbivores1);
                        System.out.println("Травоядных или плотоядных и маленьких omnivorous: " + herbivoresOrCarnivorousAndMini);
                        System.out.println("Всеядных и невысоких животных: " + omnivorous);
                    }
                } else {
                    System.out.println("Файл не существует");
                }
            }return animal;
        }
        public static int getHowManyAnimals(){
            return allAnimal.size();
        }

        public static int getHowManyAnimal(String type,String height, String weight) throws FileNotFoundException{
            return getAllAnimal(type,height,weight).size();
        }
    }


    