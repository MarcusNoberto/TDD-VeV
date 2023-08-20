import java.util.List;
import java.util.ArrayList;

// Enumeração para representar as prioridades das tarefas
enum Priority {
    HIGH, MEDIUM, LOW
}

public class Task {
    private static int nextId = 1; // Inicializa o próximo ID como 1.
    private int id;
    private String title;
    private String description;
    private String dueDate;
    private Priority priority;

    public Task(String title, String description, String dueDate, Priority priority) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("O título da tarefa não pode estar vazio.");
        }
        this.id = nextId++;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    // Getters para os atributos, incluindo o ID.
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("O título da tarefa não pode estar vazio.");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}

