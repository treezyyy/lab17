import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String regex1 = "-?\\d+";
        String regex2 = "[-+*/]";
        System.out.println("Введите первое число");
        String FirstNumber = CheckInt(regex1);
        System.out.println("Введите второе число");
        String SecondNumber = CheckInt(regex1);
        System.out.println("Введите операцию");
        String Operation = CheckOperation(regex2);
        List<String> strList1 = new ArrayList<>(Arrays.asList(FirstNumber, Operation, SecondNumber));
        System.out.println(calculate(strList1));
    }
    public static Double calculate(List<String> strList){
        switch (strList.get(1)){
            case "+":
                double result = Integer.parseInt(strList.get(0)) +  Integer.parseInt(strList.get(2));
                return result;
            case "-":
                double result1 = Integer.parseInt(strList.get(0)) -  Integer.parseInt(strList.get(2));
                return result1;
            case "*":
                double result2 = Integer.parseInt(strList.get(0)) *  Integer.parseInt(strList.get(2));
                return result2;
            case "/":
                double result3 = Double.parseDouble(strList.get(0)) /  Double.parseDouble(strList.get(2));
                return result3;
        }
        return null;
    }

    public static String CheckOperation(String reg){
        boolean test = true;
        Scanner sc = new Scanner(System.in);
        String newString =sc.nextLine();
        while (test){
            if (newString.matches(reg)){
                test = false;
            } else {
                System.out.println("Вы ввели не верную операцию, попробуйте ещё раз");
                Scanner vc = new Scanner(System.in);
                newString = vc.nextLine();
            }
        }
        return newString;
    }
    public static String CheckInt(String reg){
        boolean test = true;
        Scanner sc = new Scanner(System.in);
        String newString =sc.nextLine();
        while (test){
            if (newString.matches(reg)){
                test = false;
            } else {
                System.out.println("Вы ввели не число, попробуйте ещё раз");
                Scanner vc = new Scanner(System.in);
                newString = vc.nextLine();
            }
        }
        return newString;
    }
}