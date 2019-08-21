package Zad1;

import java.security.InvalidParameterException;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = getNumbers();
            System.out.println(numbers);
            invertNumbers(numbers);
            System.out.println("Suma liczb: " + sumNumbers(numbers));
            minMax(numbers);
        }catch (InputMismatchException e){
            System.out.println("Blednie wprowadzona liczba");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Brak liczb do uruchomienia programu");
        }
    }

    private static List<Integer> getNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby");
        List<Integer> numbers = new LinkedList<>();
        int newNumber = scanner.nextInt();
        while (newNumber>=0){
            numbers.add(newNumber);
            newNumber = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }

    private static void invertNumbers (List<Integer> numbers){
        System.out.print("Odrocona kolejność: ");
        for (int i = (numbers.size()-1); i >= 0 ; i--){
            System.out.print(numbers.get(i)+ " ");
        }
        System.out.println();
    }

    private static String sumNumbers (List<Integer> numbers){
        String stringSum = ""+numbers.get(0);
        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++){
            result +=numbers.get(i);
            stringSum += "+"+numbers.get(i);
        }
        stringSum += "="+ result;
        return stringSum;
    }

    private static void minMax (List<Integer> numbers){
      TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer number : numbers){
            treeSet.add(number);
        }
        System.out.println("Liczba min: " + treeSet.first());
        System.out.println("Liczba max: " + treeSet.last());
    }
}

