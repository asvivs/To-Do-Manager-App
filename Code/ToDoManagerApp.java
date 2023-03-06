import java.util.Scanner;
public class ToDoManagerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_option;
        Pojo p1 = new Pojo();
        do {
            //Menu
            System.out.println("Hey User, ");
            System.out.println();
            System.out.println("                Please select the option         ");
            System.out.println("0. Exit the Application ");
            System.out.println("1. Add the task ");
            System.out.println("2. Update the task ");
            System.out.println("3. Delete the task ");
            System.out.println("4. Search the task ");
            System.out.println("5. Assign the task ");
            user_option = sc.nextInt();

            //switch to call method

            switch (user_option) {
                case 1 -> p1.addTask();
                case 2 -> p1.updateTask();
                case 3 -> p1.delTask();
                case 4 -> p1.searchTask();
                case 5 -> p1.assignTask();
                case 0 -> System.out.println("Exited");
                default -> System.out.println("Please choose the correct option....");
            }
        }while(user_option != 0);

    }
}
