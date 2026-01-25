package StreamAPI.Lambda;

public class First {
    public static void main(String[] args) {
        Addition<Integer> cad = (i,j)-> (i+j);
        System.out.println(cad.add(2, 2));
    }
}

@FunctionalInterface
interface Addition<T> {
    T add(T i, T j);
}
