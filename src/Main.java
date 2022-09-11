public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listenerOne = System.out::println;
        OnTaskErrorListener listenerTwo = System.out::println;
        Worker worker = new Worker(listenerOne, listenerTwo);
        worker.start();
    }
}