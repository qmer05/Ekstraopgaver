package _5dialog_med_bruger;

import java.util.Scanner;

public class Dialog {
    private int currentYear;

    private int pensionYear = 67;

    public Dialog(int currentYear) {
        this.currentYear = currentYear;
    }

    public void getYearOfBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast dit fødselsår: ");
        String userInput = scanner.nextLine();
        int ui = Integer.parseInt(userInput);

        if (ui > 999 && ui <= 9999 && ui < currentYear) {
            int yearsToRetirement = getYearsToRetirement(ui);
            System.out.println("Du har nu " + yearsToRetirement + " år til pensionering");
        } else {
            System.out.println("Ugyldigt input");
            getYearOfBirth();
        }
    }

    public int getYearsToRetirement(int i) {
        return i + pensionYear - currentYear;
    }

}
