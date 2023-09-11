package main;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class TaskManager {
	private List<Task> tasks = new ArrayList<>();

    public Task createNewTask(String title, String description, String dueDate, Priority priority) {
        Task newTask = new Task(title, description, dueDate, priority);
        tasks.add(newTask);
        return newTask;
    }

    public boolean updateTaskDetails(Task task, String title, String description, String dueDate, Priority priority) {
        if (!tasks.contains(task)) {
            return false;
        }

        task.setTitle(title);
        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setPriority(priority);
        return true;
    }

    public boolean deleteTask(Task task) {
        return tasks.remove(task);
    }

    public List<Task> listTasks() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparing(Task::getPriority).thenComparing(Task::getDueDate));
        return sortedTasks;
    }

    public void setTaskPriority(Task task, Priority priority) {
        task.setPriority(priority);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
