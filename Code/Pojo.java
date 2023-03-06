import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Pojo {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    ArrayList<Task> task = new ArrayList<>();
    AtomicInteger id_generator = new AtomicInteger(1000);

    public void addTask() {
        System.out.println("How many task you need to add? ");
        int task_num = sc1.nextInt();
        for (int i = 0; i < task_num; i++) {
            System.out.println("Enter the task name: ");
            String title = sc.nextLine();
            System.out.println("Enter task text: ");
            String text = sc.nextLine();
            int id = id_generator.getAndIncrement();
            String assign = "Not Assigned";
            task.add(new Task(id, title, text, assign));
        }
        for (Task t1 : task) {
            System.out.println(t1);
        }
        System.out.println();
        System.out.println("!!!!!TASK ADDED SUCCESSFULLY!!!!!");
        System.out.println("---------------------------------------------------------------------------------------");

    }

    Task tsk = new Task();

    public void updateTask() {
        int i = 0;
        for (Task t1 : task) {
            System.out.println(t1);
        }
        System.out.println();
        System.out.println("Enter the task ID of task which you need to update ");
        int update_id = sc1.nextInt();
        for (Task t1 : task) {
            if (t1.getTaskId() == update_id) {
                System.out.println("Enter the  task name you need to update: ");
                t1.setTaskTitle(sc.nextLine());
                System.out.println("Enter the  task text you need to update: ");
                t1.setTaskText(sc.nextLine());
                i = 1;
            }
        }
        if (i != 0) {
            System.out.println("!!!!!TASK UPDATED SUCCESSFULLY!!!!!");
            for (Task t2 : task) {
                System.out.println(t2);
            }
        } else {
            System.out.println("-------!!!!------You can only update the task which you added-----!!!!--------");
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public void delTask() {
        Task t3 = null;
        for (Task t1 : task) {
            System.out.println(t1);
        }
        System.out.println();
        System.out.println("Enter the task ID of task which you need to delete ");
        int del_id = sc1.nextInt();
        for (Task t1 : task) {
            if (t1.getTaskId() == del_id) {
                t3 = t1;
            }
        }
        if (t3 != null) {
            task.remove(t3);
            System.out.println("!!!!!TASK DELETED SUCCESSFULLY!!!!!");
            for (Task t1 : task) {
                System.out.println(t1);
            }
        } else {
            System.out.println("-------!!!!------You can only delete the task which you added-----!!!!--------");
        }

        System.out.println("---------------------------------------------------------------------------------------");

    }

    public void searchTask() {
        //boolean search_found = false;
        Task t3 = null;
//        for (Task t1 : task) {
//            System.out.println(t1);
//        }
//        System.out.println();
        System.out.println("Enter the task ID of task which you need to search ");
        int search_id = sc1.nextInt();
        for (Task t1 : task) {
            if (t1.getTaskId() == search_id) {
                t3 = t1;
            }
        }
        if (t3 != null) {
            System.out.println("TASK FOUND");
            System.out.println(t3.toString());
            System.out.println("---------------------------------------------------------------------------------------");
        } else {
            System.out.println("OOPS :( TASK NOT FOUND!!!!!");
            System.out.println("---------------------------------------------------------------------------------------");
        }
    }

    public void assignTask() {
        Task t3 = null;
        String s = null;
        for (Task t1 : task) {
            System.out.println(t1);
        }
        System.out.println();
        System.out.println("Enter the task ID of task which you need to assign ");
        int assign_id = sc1.nextInt();
        for (Task t1 : task) {
            if (t1.getTaskId() == assign_id) {
                System.out.println("Enter the  name of person to whom you need to assign the selected task: ");
                s = sc.nextLine();
                t3 = t1;
            }

        }
        if (s != null) {
            t3.setAssignedTo(s);
            for (Task t1 : task) {
                System.out.println(t1.toString());
            }
            System.out.println("!!!!!TASK ASSIGNED SUCCESSFULLY!!!!!");
        } else {
            System.out.println("-------!!!!------You can only assign the task which you added-----!!!!--------");
        }
    }
}
