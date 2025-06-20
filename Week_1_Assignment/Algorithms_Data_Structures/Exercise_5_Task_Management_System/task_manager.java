//package practise.Algorithms_Data Structures.Exercise 5_Task Management System;
class task{
    int taskId;
    String taskName;
    String status;
    task next;

    public task(int taskId, String taskName, String status, task next){
        this.taskId = taskId;
        this.taskName = taskName;
        this. status = status;
        this. next = null;
    }

    public void display() {
        System.out.println("Task ID: " + taskId + ", Task Name: " + taskName + ", Status: " + status);
    }
}

 class operator{
    private task head;

    public void addtask(int taskId, String taskName, String status){
        task nt = new task(taskId, taskName, status, null);

        if(head == null){
            head = nt;
        } else{
            task curr = head;
            while( curr.next != null){
                curr = curr.next;
            }
            curr.next = nt;
        }
        System.out.println("Task added ");
    }

    public task search(int id){
        task curr = head;
        while(curr != null){
            if(curr.taskId == id){
               
                return curr;
            }
            curr = curr.next;
        }

        return null;
    }

    public void del(int id){

        if(head == null){
            System.out.println("The list is empty");
        }
        task prev = head;
        task curr = head.next;

        while(curr != null){
            if(curr.taskId == id){
                prev.next = curr.next;
                System.out.println("Task deleted ");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void traverse(){
        if(head == null){
            System.err.println("No task");
        } 
        task curr = head;
        System.out.println("Task List:");
        while (curr != null) {
            curr.display();
            curr = curr.next;
        }
    }

    
}
public class task_manager {
    public static void main(String args[]) {
        operator op = new operator();

        
        op.addtask(1, "project", "Pending");
        op.addtask(2, "dsa", "In Progress");
        op.addtask(3, "apti", "Completed");

     
        op.traverse();

        int searchId = 2;
        task found = op.search(searchId);
        if (found != null) {
            System.out.println("\nFound Task:");
            found.display();
        } else {
            System.out.println("\nTask not found.");
        }

        op.del(2);
        System.out.println("\nAfter deletion:");
        op.traverse();
    }

}
