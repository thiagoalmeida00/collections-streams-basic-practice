package collections.stream;

import java.util.*;

public class practice {

    public static void main(String[] args) {

        // Collections: implementations with List, Set and Map.
        System.out.println("Teste");

        //1 add elements to list
        //List
        List<String> namesList = new ArrayList<>();
        namesList.add("João");
        namesList.add("Maria");
        namesList.add("Vitor");
        namesList.add("Ana");

        //Set
        Set<String> namesSet = new HashSet<>();
        namesSet.add("João");
        namesSet.add("Maria");
        namesSet.add("Vitor");
        namesSet.add("Ana");

        //Map
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "João");
        namesMap.put(2, "Maria");
        namesMap.put(3, "Vitor");
        namesMap.put(4, "Ana");

        System.out.println("1 --->");
        System.out.println("List:" + namesList);
        System.out.println("Set:" + namesSet);
        System.out.println("Map:" + namesMap);

        //2 remove elements to list
        //List
        List<String> studentsList = new ArrayList<>();
        studentsList.add("Joana");
        studentsList.add("Lucas");
        studentsList.add("Pedro");
        studentsList.add("Antônio");
        studentsList.removeIf(f -> f.equalsIgnoreCase("Pedro"));

        //Set
        Set<String> studentsSet = new HashSet<>();
        studentsSet.add("Joana");
        studentsSet.add("Lucas");
        studentsSet.add("Pedro");
        studentsSet.add("Antônio");
        studentsSet.removeIf(f -> f.equalsIgnoreCase("Pedro"));

        //Map
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Joana");
        studentsMap.put(2, "Lucas");
        studentsMap.put(3, "Pedro");
        studentsMap.put(4, "Antônio");
        studentsMap.remove(3);

        System.out.println("2 --->");
        System.out.println(studentsList);
        System.out.println(studentsSet);
        System.out.println(studentsMap);

        //3
        //List
        //Set
        //Map

        // Streams

    }

}
