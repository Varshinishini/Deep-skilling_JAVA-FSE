package Task_Management_System;

public class SinglyLinkedList {
    private Node head;
    
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Task searchTaskById(String taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId)) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null; // Not found
    }

    public void displayTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public void deleteTask(String taskId) {
        if (head == null) return;
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && !temp.next.task.getTaskId().equals(taskId)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}