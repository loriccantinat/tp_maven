package fr.esir.omd.ci;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TaskManager {
    private List<Task> tasks;
    private static final Logger logger = LoggerFactory.getLogger(TaskManager.class);


    public TaskManager() {
        tasks = new ArrayList<>();
        logger.info("TaskManager initialized");
    }

    /* Ceci est un commentaire pour la méthode addTask */
    public void addTask(Task task) {
        tasks.add(task);
        logger.info("Added task: {}", task.getTitle());
    }

    /* Ceci est un commentaire pour la méthode removeTask */
    public void removeTask(Task task) {
        tasks.remove(task);
        logger.info("Removed task: {}", task.getTitle());
    }

    /* Ceci est un commentaire pour la méthode getTasks */
    public List<Task> getTasks() {
        logger.debug("Retrieving all tasks, count: {}", tasks.size());
        return tasks;
    }

    int variable_morte = 5; //variable non utilisée
    //méthode non utilisée
    public void methode_morte(){
        System.out.println("Ceci est une méthode morte");
    }

}

