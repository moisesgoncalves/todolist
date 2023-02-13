package TodoList;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.add(Importance.HIGH,2,"Rice");
        todoList.add(Importance.LOW,1,"Kitchen Paper");
        todoList.add(Importance.MEDIUM,1,"Soap");
        todoList.add(Importance.HIGH,1,"Beer");
        todoList.add(Importance.MEDIUM, 2, "Bananas");
        todoList.add(Importance.LOW, 2, "Water");

        while (!todoList.isEmpty()) {
            System.out.println(todoList.remove());
        }
    }
}