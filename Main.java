
import java.util.Scanner;

public class Main {
    public static String calc(String input) {
        input=input.replaceAll(" ","");
        try {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '/' || input.charAt(i) == '*') {
                    char operation = input.charAt(i);
                    int a = Integer.parseInt(input.substring(0, i));
                    int b = Integer.parseInt(input.substring(i + 1));
                    if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
                        switch (operation) {
                            case '+':
                                return String.valueOf(a + b);
                            case '-':
                                return String.valueOf(a - b);
                            case '/':
                                return String.valueOf(a / b);
                            case '*':
                                return String.valueOf(a * b);
                        }
                    } else {
                        throw new IllegalArgumentException("недопустимые значения чисел");
                    }
                }
            }
        }catch(NumberFormatException e) {
            throw new NumberFormatException ("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        throw new IllegalArgumentException("строка не является математической операцией");
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(calc(s));
        sc.close();
    }
}