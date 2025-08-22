package collections.stream;

import java.util.*;
import java.util.stream.Collectors;

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

        //3 getting elements
        System.out.println("3 --->");
        //List
        List<String> employeesList = List.of("João", "Maria", "Ana", "Pedro", "Antõnio");
        String secondPersonList = employeesList.get(1);
        Integer sizeList = employeesList.size();
        System.out.println("A segunda pessoa da lista é: " + secondPersonList);
        System.out.println("Total de funcionários: " + sizeList);

        //Set
        Set<String> employeesSet = Set.of("João", "Maria", "Ana", "Pedro", "Antõnio");
        String secondPersonSet = employeesSet.stream().skip(1).findFirst().get();
        Integer sizeSet = employeesSet.size();
        System.out.println("A segunda pessoa da lista é: " + secondPersonSet);
        System.out.println("Total de funcionários: " + sizeSet);

        //Map
        Map<Integer, String> employeesMap = Map.of(1, "João", 2, "Maria", 3, "Ana", 4, "Pedro", 5, "Antõnio");
        String secondPersonMap = employeesMap.get(2);
        Integer sizeMap = employeesMap.size();
        System.out.println("A segunda pessoa da lista é: " + secondPersonMap);
        System.out.println("Total de funcionários: " + sizeMap);

        //4 unique elements
        System.out.println("4 --->");
        List<String> eventList = new ArrayList<>();
        eventList.add("IA Conference Brasil");
        eventList.add("AI Summit");
        eventList.add("DevFest");
        eventList.add("Cloud Expo");
        eventList.add("IA Conference Brasil");
        eventList.add("DevFest");

        Set<String> eventUniqueList = new HashSet<>(eventList);
        System.out.println(eventUniqueList);

        //5 map
        System.out.println("5 --->");
        Map<Integer, String> clientsMap = new HashMap<>();
        clientsMap.put(1, "João");
        clientsMap.put(2, "Marcos");
        clientsMap.put(3, "Dora");
        System.out.println("O nome do cliente com ID 2 é: " + clientsMap.get(2));

        //6
        System.out.println("6 --->");
        Map<Integer, String> employeesListMap2 = new HashMap<>();
        employeesListMap2.put(1, "Maria");
        employeesListMap2.put(2, "Marcos");
        employeesListMap2.put(3, "Ana");
        employeesListMap2.put(4, "Joana");
        employeesListMap2.put(5, "Karen");

        System.out.println("Procurando id 5");
        int times = 2;
        int key = 5;
        for (int i = 0; i < times; i++) {
            boolean idExists = false;

            idExists = employeesListMap2.containsKey(key);

            if (idExists) {
                String employeeName = employeesListMap2.get(key);
                System.out.println("O nome do cliente com ID " + key + " é: " + employeeName);
            } else {
                System.out.println("Cliente com ID " + key + " não encontrado");
            }
            key = 6;
        }

        //7
        System.out.println("7 --->");
        List<String> empList = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> empListFinal = empList.stream()
                .filter(f -> f.chars().count() <= 5).collect(Collectors.toUnmodifiableList());

        System.out.println(empListFinal);
    }

}
