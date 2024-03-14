import java.util.concurrent.CompletableFuture;
<<<<<<< HEAD

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
=======
import java.util.function.BiFunction;

public class App {
    public static void main(String[] args) throws Exception {

        BiFunction<Integer, Integer, Integer> randoGenerator = (min, max) -> {
            int size = max - min + 1;
            double rando = size * Math.random();
            return (int) Math.floor(rando);
        };

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> randoGenerator.apply(0, 10));

        System.out.println(future.get());
    }

}
>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4