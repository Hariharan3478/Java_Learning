package Day19;

import module java.base;

public class ModuleImportDemo {

    public static void main(String[] args) {

        List<String> technologies = new ArrayList<>();

        technologies.add("Java");
        technologies.add("Spring Boot");
        technologies.add("PostgreSQL");
        technologies.add("Maven");

        technologies.forEach(System.out::println);
    }
}