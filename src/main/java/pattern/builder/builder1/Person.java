package pattern.builder.builder1;

public class Person {
    private String name;
    private int age;
    private String color;
    private String country;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.color = builder.color;
        this.country = builder.country;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", color='" + color + '\'' +
               ", country='" + country + '\'' +
               '}';
    }

    public static class Builder {

        private String name;
        private int age;
        private String color;
        private String country;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }
}
