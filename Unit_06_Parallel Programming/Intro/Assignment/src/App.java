public class App{
    public static void main(String[] args) throws Exception {
        for(int i = 0; i <= 10000; i++){
        SqrtRunnable demo = new SqrtRunnable(i);
        demo.start();
            //Construct a Runnable passing i
            //start the SqrtRunnable with the start(method)
        }
    }
}
