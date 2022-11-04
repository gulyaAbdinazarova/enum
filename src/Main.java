import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String soz = scanner.nextLine();
        Week week = Week.valueOf(soz.toUpperCase());
        switch (week){
            case MONDAY -> System.out.println("java sabagyn okuybuz");
            case TUESDAY -> System.out.println("java praktikalyk sabak");
            case WEDNESDAY -> System.out.println("java tehnikalyk sabak");
            case THURSDAY -> System.out.println("softskilss sabagu");
            case FRIDAY -> System.out.println("English sabagy");
            case SATURDAY -> System.out.println("praktica");
            case SANDAY -> System.out.println("dem alysh kun");
        }


    }
}