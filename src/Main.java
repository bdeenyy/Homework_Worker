public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listenerOne = System.out::println;
        Worker.OnTaskErrorListener listenerTwo = System.out::println;
        Worker worker = new Worker(listenerOne, listenerTwo);
        worker.start();
    }
}