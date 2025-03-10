import { TaskManager } from "./services/TaskManager";

const taskManager = new TaskManager();

try {
    taskManager.addTask("Learn TypeScript", "Understand basic TypeScript concepts.");
    taskManager.addTask("Build a Project", "Create a simple task manager application.");
    
    console.log("All Tasks:", JSON.stringify(taskManager.getTasks(), null, 2));

    taskManager.markTaskAsComplete("Learn TypeScript");
    console.log("Updated Tasks:", JSON.stringify(taskManager.getTasks(), null, 2));

    taskManager.deleteTask("Build a Project");
    console.log("Tasks after deletion:", JSON.stringify(taskManager.getTasks(), null, 2));
} catch (error) {
    console.error("Error:", (error as Error).message);
}
