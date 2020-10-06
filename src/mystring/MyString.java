package mystring;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class MyString {


    public static void main(String[] args) {
//        String a = "Hello ";
//        String b = "Nadir!";
//        StringBuilder strBuilder = new StringBuilder();
//        strBuilder.append(a);
//        strBuilder.append(b);
//        System.out.println(strBuilder.toString());

//        Scanner myScan = new Scanner(System.in);
//        System.out.println("Hi! What is your name?");
//        String name = myScan.nextLine();
//        System.out.println("How old are you?");
//        int years = myScan.nextInt();
//        System.out.println(new StringBuilder("You name --> ").append(name).toString());
//        System.out.println(new StringBuilder("You years old  --> ").append(years).toString());
//    }

//        Console cons = System.console();
//        String userName = cons.readLine("User name: ");
//        char[] passWord = cons.readPassword("Password: ");
//        System.out.println(new StringBuilder("You data: ").append(userName).append(passWord));

//        double x = 1000.0 / 3.0;
//        System.out.printf("%8.2f", x);
//        String name;
//        int age;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Put you name: ");
//        name = scanner.nextLine();
//        System.out.println("Put you age: ");
//        age = scanner.nextInt();
//        System.out.printf("Hello, %s. Next year you'll be %d", name, age + 1);

//        int[] a = {1,2,3,4,5,6,7,8,9};
//        int[] b = Arrays.copyOf(a, a.length);
//        int[] c = Arrays.copyOf(a, 2*a.length);
//        int[] d = a;
//        b[3] = 11;
//        c[9] = 11;
//        d[3] = 15;
//        System.out.println("Massive a: " + Arrays.toString(a));
//        System.out.println("Massive b: " + Arrays.toString(b));
//        System.out.println("Massive c: " + Arrays.toString(c));
//        System.out.println("Massive d: " + Arrays.toString(d));.
        int[] randomArray = new int[100];

        int randomElement;
        int range = 100;
        int rangeRandom = range + 1; // n-1 ---> range 0 to 10
        int[] countArray = new int[rangeRandom];
        for (int i = 0; i < randomArray.length; i++) {
            randomElement = (int)(Math.random() * rangeRandom);
            randomArray[i] = randomElement;
        }
        System.out.println("Random array before sorted ---> " + Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Random array after sorted ---> " + Arrays.toString(randomArray) + "Length Array ---> " + randomArray.length);

        for (int i = 0; i < 100; i++) {
            countArray[randomArray[i]]++;
        }

        for (int i = 0; i < countArray.length; i++) {
            System.out.println("Количество повторов числа " + i + " ---> " + countArray[i] + " раз");
        }

    }
}