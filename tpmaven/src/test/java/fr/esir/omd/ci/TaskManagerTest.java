package fr.esir.omd.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class TaskManagerTest {

    @Test
    public void testAddTask() {

        TaskManager manager = new TaskManager();
        Task task = new Task("Acheter du pain","Acheter du pain à la boulangerie", false);
        
        manager.addTask(task);
        
        List<Task> tasks = manager.getTasks();
        assertEquals("La liste devrait contenir 1 tâche", 1, tasks.size());
        assertEquals("Le titre de la tâche est incorrect", "Acheter du pain", tasks.get(0).getTitle());
    }

    @Test
    public void testRemoveTask() {
        TaskManager manager = new TaskManager();
        Task task = new Task("Faire le ménage", "Nettoyer toute la maison", false);
        manager.addTask(task);
        
        manager.removeTask(task);
        
        assertTrue("La liste devrait être vide après suppression", manager.getTasks().isEmpty());
    }
    
}