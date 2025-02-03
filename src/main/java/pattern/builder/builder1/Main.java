package pattern.builder.builder1;

public class Main {
    public static void main(String[] args) {
        Person chinaBoy = new Person.Builder()
                .setName("Kun Lu")
                .setAge(22)
                .setColor("Yellow")
                .setCountry("China")
                .build();

        System.out.println(chinaBoy);

        Person africaBoy = new Person.Builder()
                .setName("Jo Jo")
                .setAge(24)
                .setColor("Black")
                .setCountry("Africa")
                .build();

        System.out.println(africaBoy);
    }
}
