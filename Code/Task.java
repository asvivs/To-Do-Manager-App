public class Task {
    public int getTaskId() {
        return TaskId;
    }

//    public void setTaskId(int taskId) {
//        TaskId = taskId;
//    }
//
//    public String getTaskTitle() {
//        return TaskTitle;
//    }

    public void setTaskTitle(String taskTitle) {
        TaskTitle = taskTitle;
    }

//    public String getTaskText() {
//        return TaskText;
//    }

    public void setTaskText(String taskText) {
        TaskText = taskText;
    }
//
//    public String getAssignedTo() {
//        return AssignedTo;
//    }

    public void setAssignedTo(String assignedTo) {
        AssignedTo = assignedTo;
    }

    int TaskId;
    String TaskTitle, TaskText, AssignedTo;


    Task(int id, String title, String text, String assign) {
        this.TaskId = id;
        this.TaskTitle = title;
        this.TaskText = text;
        this.AssignedTo = assign;
    }
    Task() {

    }

    @Override
    public String toString() {
        return "TaskId: " + TaskId +"\n"+
                "TaskTitle: " + TaskTitle + "\n"+
                "TaskText: " + TaskText + "\n" +
                "assignedTo: " + AssignedTo;
    }
}
