import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner getInput = new Scanner(System.in);

        mainMenu(getInput);

    }

    public static void mainMenu(Scanner get){

        System.out.println("Choose your Transaction:\n0-Exit\n1-Enter Number\n2-Enter Month\nYour Choose:");
        mainMenuChoose(get.nextInt());
    }

    public static void mainMenuChoose(int ch){
        switch (ch){
            case 0:
                // break
                break;
            case 1:
                // if-case
                enterNum();
                break;
            case 2:
                // switch case
                enterMonths();
                break;
            default:
                break;
        }
    }

    // switch statetments
    private static void enterMonths() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("\n***************\nEnter the Month");
        // to space
        String userValue = getInput.next();
        userValue = userValue.toLowerCase();
        String season = findSeason(userValue);
        switch (season){
            case "winter":
                System.out.println("You are in the Winter season..");
                break;
            case "summer":
                System.out.println("You are in the Summer season..");
                break;
            case "autumn":
                System.out.println("You are in the Autumn season..");
                break;
            case "spring":
                System.out.println("You are in the Spring season..");
                break;
            default:
                System.out.println("ERROR!?");
                enterMonths();
                break;
        }

    }

    public static String findSeason(String month){
        if (month.equals("january")||month.equals("february")||month.equals("december"))
            return "winter";
        else if (month.equals("october")||month.equals("november")||month.equals("september"))
            return "autumn";
        else if (month.equals("march")||month.equals("april")||month.equals("may"))
            return "spring";
        else if (month.equals("june")||month.equals("july")||month.equals("august"))
            return "summer";
        else {
            return "none";
        }
    }

    // if statements
    private static void enterNum() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("\n***************\nEnter the Number");
        int number = getInput.nextInt();

        if (number>0&&number<100){
            System.out.println("Girilen Değer "+(number/10)*10 + " ile "+((number/10)+1)*10+" arasındadır");
            }
        else{
            System.out.println("Lütfen geçerli bir değer giriniz..(0-100)");
            enterNum();
        }
        }

    }
