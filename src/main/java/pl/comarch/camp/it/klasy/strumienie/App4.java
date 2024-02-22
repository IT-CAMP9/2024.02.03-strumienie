package pl.comarch.camp.it.klasy.strumienie;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class App4 {
    public static void main(String[] args) {
        Optional<Integer> integerBox = Optional.of(5);


        integerBox.orElseThrow(() -> new JakisWyjatek());

        Consumer<String> c = s -> System.out.println(s);

        try {
            integerBox.get();
        } catch (NoSuchElementException e) {
            throw new JakisWyjatek();
        }

        if(integerBox.isEmpty()) {
            throw new JakisWyjatek();
        }
    }
}
