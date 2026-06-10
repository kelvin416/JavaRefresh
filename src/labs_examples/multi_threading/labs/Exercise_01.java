package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Student{
    public static void main(String[] args) {

        System.out.println("....Thread starting");

        StudentThread studentThread = new StudentThread("James");
        StudentThread studentThread2 = new StudentThread("Cerise");
        StudentThread studentThread3 = new StudentThread("Charles");

        System.out.println("Thread Finishing....");
    }
}

class StudentThread implements Runnable{

    Thread thread;

    StudentThread(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting school");
        try {
            for (int sem = 1; sem <= 4; sem++){
                Thread.sleep(600);
                System.out.println(thread.getName() + " goes to school in sem " + sem);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted");
        }
    }
}


