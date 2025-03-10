"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TaskManager = void 0;
const Task_1 = require("../models/Task");
class TaskManager {
    constructor() {
        this.tasks = [];
    }
    addTask(title, description) {
        const task = new Task_1.Task(title, description);
        this.tasks.push(task);
        console.log(`Task "${title}" added successfully.`);
    }
    getTasks() {
        return this.tasks;
    }
    getTaskByTitle(title) {
        return this.tasks.find(task => task.title === title);
    }
    markTaskAsComplete(title) {
        const task = this.getTaskByTitle(title);
        if (!task) {
            throw new Error(`Task "${title}" not found.`);
        }
        task.isCompleted = true;
        console.log(`Task "${title}" marked as complete.`);
    }
    deleteTask(title) {
        const index = this.tasks.findIndex(task => task.title === title);
        if (index === -1) {
            throw new Error(`Task "${title}" not found.`);
        }
        this.tasks.splice(index, 1);
        console.log(`Task "${title}" deleted successfully.`);
    }
}
exports.TaskManager = TaskManager;
