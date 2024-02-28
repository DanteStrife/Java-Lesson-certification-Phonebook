import java.util.Objects;

public class Cat {
    private String name;
    private String breed;
    private String owner;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, String breed, String owner, int age) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed) && Objects.equals(owner, cat.owner);
    }

    @Override
    public int hashCode() {
        return 6 * name.hashCode() + 7 * breed.hashCode() + 6 * age + 11 * owner.hashCode();
    }
}
