import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) throws Exception {
        double num = Math.random();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(
            () -> ("Your number is " + num)
        );

        CompletableFuture<Void> newFuture = future.thenAccept(s -> {
            System.out.println(s + ". Your number's double is " + num * 2 + "!");
        });

        newFuture.get();
// this isn't really correct but it's close enough
    }
}