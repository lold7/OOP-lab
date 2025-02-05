public class test {
    public static void main(String[] args) {
        System.out.println(new Integer(20).compareTo(new Integer(10)));
    }

    public interface Comparable<E> {
        public int compareTo(E o);
    }
}
