import java.util.Scanner;
  class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to day cahcker");
        System.out.println("Please Enter your Day Number ");
        int day = input.nextInt();

        String daySwitch = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day Number";

        };

        System.out.println(daySwitch);
    

    //     switch  (day){
    //         case 1 : System.out.println("Monday");
    //         break;
    //         case 2 : System.out.println("Tuesday");
    //         break;
    //         case 3 : System.out.println("wendnesday");
    //         break;
    //         case 4 : System.out.println("Thursday");
    //         break;
    //         case 5 : System.out.println("Friday");
    //         break;
    //         case 6 : System.out.println("Saturday");
    //         break;
    //         case 7 : System.out.println("Sunday");
    //         break;
    //         default : System.out.println(" invalid day Number");
         
        

    //     }
    }

  }