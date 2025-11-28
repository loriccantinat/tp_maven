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
    public void methode_morte(int parametre_inutile) {
        String variableQuiSertARien = "Je ne suis jamais lue";
        int calculInutile = 5 + 5;
        
        if (true) {
            // Un if qui est toujours vrai, c'est suspect
            return;
        }    
    }

    public void traiterTacheA() {
        System.out.println("Début du traitement complexe");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Pair : " + i);
            } else {
                System.out.println("Impair : " + i);
            }
        }
        System.out.println("Fin du traitement");
    }

    //COPIE EXACTE de traiterTacheA
    public void traiterTacheB() {
        System.out.println("Début du traitement complexe");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Pair : " + i);
            } else {
                System.out.println("Impair : " + i);
            }
        }
        System.out.println("Fin du traitement");
    }

}

