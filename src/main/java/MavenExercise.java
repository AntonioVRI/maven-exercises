import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MavenExercise {
    public static void main(String[] args) {

        System.out.println("Enter something here: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        System.out.printf("Your entry: %s\n", userInput);
        if (StringUtils.isBlank(userInput))
            System.out.println("Please enter ANYTHING");
        else if (StringUtils.isNumeric(userInput))
            System.out.printf("%s is a number!\n", userInput);
        else
            System.out.printf("%s not a number!\n", userInput);

        System.out.printf("Flipped: %s\n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(userInput));

    }
}
