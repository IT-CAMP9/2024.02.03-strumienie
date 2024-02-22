package pl.comarch.camp.it.klasy.strumienie;

import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,1,2,3,5,6,13,7,8,9,2,6,2,13,15);

        int result = list.stream().reduce(null, (acc, element) -> {
            if(acc == null) {
                return element;
            }
            return acc;
        });
        System.out.println(result);
    }
}
