package TodoList;

import java.util.PriorityQueue;

public class TodoList {

    private PriorityQueue <Todo> priorityQueue;

    public TodoList() {
        this.priorityQueue = new PriorityQueue();
    }

    public void add(Importance importance, int priority, String item) {
        Todo todo = new Todo(importance, priority, item);
        priorityQueue.add(todo);
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    public Todo remove() {
        return priorityQueue.poll();
    }

}
