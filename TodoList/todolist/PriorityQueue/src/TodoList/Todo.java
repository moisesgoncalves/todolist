package TodoList;

public class Todo implements Comparable<Todo> {
    private Importance importance;
    private String item;
    private int priority;

    public Todo(Importance importance, int priority, String item) {
        this.importance = importance;
        this.item = item;
        this.priority = priority;
    }

    @Override
    public int compareTo(Todo todo) {
        if (importance == todo.importance) {
            if (priority < todo.priority) {
                return -1;
            } else if (priority == todo.priority) {
                return 0;
            } else {
                return 1;
            }
        }
        return importance.compareTo(todo.importance);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "importance=" + importance +
                ", item='" + item + '\'' +
                ", priority=" + priority +
                '}';
    }

}



