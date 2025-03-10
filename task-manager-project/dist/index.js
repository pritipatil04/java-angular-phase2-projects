"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const TaskManager_1 = require("./services/TaskManager");
const taskManager = new TaskManager_1.TaskManager();
try {
    taskManager.addTask("Learn TypeScript", "Understand basic TypeScript concepts.");
    taskManager.addTask("Build a Project", "Create a simple task manager application.");
    console.log("All Tasks:", JSON.stringify(taskManager.getTasks(), null, 2));
    taskManager.markTaskAsComplete("Learn TypeScript");
    console.log("Updated Tasks:", JSON.stringify(taskManager.getTasks(), null, 2));
    taskManager.deleteTask("Build a Project");
    console.log("Tasks after deletion:", JSON.stringify(taskManager.getTasks(), null, 2));
}
catch (error) {
    console.error("Error:", error.message);
}
