package tests;

import static org.junit.jupiter.api.Assertions.*;
import main.Task;
import main.TaskManager;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquivalentPartitionsTests {

	@BeforeEach
    public void setUp() {
        taskManager = new TaskManager();
    }

    @Test
    public void testCreateTaskWithValidData() {
        Task task = taskManager.createNewTask("Título válido", "Descrição válida", "2023-08-30", Priority.MEDIUM);
        assertNotNull(task);
    }

    @Test
    public void testCreateTaskWithEmptyTitleAndValidDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskManager.createNewTask("", "Descrição válida", "2023-08-30", Priority.MEDIUM);
        });
    }

    @Test
    public void testCreateTaskWithValidTitleAndEmptyDescription() {
        Task task = taskManager.createNewTask("Título válido", "", "2023-08-30", Priority.MEDIUM);
        assertEquals("", task.getDescription());
    }

    @Test
    public void testCreateTaskWithEmptyTitleAndEmptyDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskManager.createNewTask("", "", "2023-08-30", Priority.MEDIUM);
        });
    }

    @Test
    public void testCreateTaskWithInvalidDueDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskManager.createNewTask("Título válido", "Descrição válida", "data inválida", Priority.MEDIUM);
        });
    }

    @Test
    public void testCreateTaskWithNullDueDate() {
        Task task = taskManager.createNewTask("Título válido", "Descrição válida", null, Priority.MEDIUM);
        assertNull(task.getDueDate());
    }

    @Test
    public void testCreateTaskWithNullPriority() {
        Task task = taskManager.createNewTask("Título válido", "Descrição válida", "2023-08-30", null);
        assertNull(task.getPriority());
    }

    @Test
    public void testUpdateTaskWithValidData() {
        Task task = taskManager.createNewTask("Título original", "Descrição original", "2023-08-30", Priority.MEDIUM);
        boolean result = taskManager.updateTaskDetails(task, "Novo título", "Nova descrição", "2023-09-15", Priority.LOW);
        assertTrue(result);
        assertEquals("Novo título", task.getTitle());
        assertEquals("Nova descrição", task.getDescription());
    }

    @Test
    public void testUpdateTaskWithEmptyTitleAndValidDescription() {
        Task task = taskManager.createNewTask("Título original", "Descrição original", "2023-08-30", Priority.MEDIUM);
        assertThrows(IllegalArgumentException.class, () -> {
            taskManager.updateTaskDetails(task, "", "Nova descrição", "2023-09-15", Priority.LOW);
        });
    }

}
