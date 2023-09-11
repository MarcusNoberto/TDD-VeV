package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.Task;
import main.TaskManager;

class TableDecisionTests {
	@BeforeEach
    public void setUp() {
        TaskManager taskManager = new TaskManager();
    }
	
	@Test
    public void testCreateTaskWithValidData() {
        Task task = taskManager.createNewTask("Sample Title", "Sample Description", "2023-09-15", Priority.LOW);
        assertNotNull(task);
    }

    @Test
    public void testCreateTaskWithEmptyTitleAndValidDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskManager.createNewTask("", "Sample Description", "2023-09-15", Priority.LOW);
        });
    }

    @Test
    public void testCreateTaskWithValidTitleAndEmptyDescription() {
        Task task = taskManager.createNewTask("Sample Title", "", "2023-09-15", Priority.LOW);
        assertEquals("", task.getDescription());
    }

    @Test
    public void testCreateTaskWithEmptyTitleAndEmptyDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskManager.createNewTask("", "", "2023-09-15", Priority.LOW);
        });
    }

    @Test
    public void testCreateTaskWithInvalidDueDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskManager.createNewTask("Sample Title", "Sample Description", "invalid date", Priority.LOW);
        });
    }

    @Test
    public void testCreateTaskWithNullDueDate() {
        Task task = taskManager.createNewTask("Sample Title", "Sample Description", null, Priority.LOW);
        assertNull(task.getDueDate());
    }

    @Test
    public void testCreateTaskWithNullPriority() {
        Task task = taskManager.createNewTask("Sample Title", "Sample Description", "2023-09-15", null);
        assertNull(task.getPriority());
    }

}
