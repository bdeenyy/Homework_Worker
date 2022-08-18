public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }
    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }
}
