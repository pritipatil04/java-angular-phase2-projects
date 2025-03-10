import { Task } from "../models/Task";

export class TaskManager {
    private tasks: Task[] = [];

    addTask(title: string, description: string): void {
        const task = new Task(title, description);
        this.tasks.push(task);
        console.log(`Task "${title}" added successfully.`);
    }

    getTasks(): Task[] {
        return this.tasks;
    }

    getTaskByTitle(title: string): Task | undefined {
        return this.tasks.find(task => task.title === title);
    }

    markTaskAsComplete(title: string): void {
        const task = this.getTaskByTitle(title);
        if (!task) {
            throw new Error(`Task "${title}" not found.`);
        }
        task.isCompleted = true;
        console.log(`Task "${title}" marked as complete.`);
    }

    deleteTask(title: string): void {
        const index = this.tasks.findIndex(task => task.title === title);
        if (index === -1) {
            throw new Error(`Task "${title}" not found.`);
        }
        this.tasks.splice(index, 1);
        console.log(`Task "${title}" deleted successfully.`);
    }
}