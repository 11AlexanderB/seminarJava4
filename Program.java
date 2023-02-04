import java.util.LinkedList;
import java.util.Queue;

/**
 * task1:
 * Реализуйте метод, который вернет "перевернутый" список LinkedList.
 */

// import java.util.LinkedList;

// public class Program {
//     public static void main(String[] args) {

//         LinkedList<String> letters = new LinkedList<>();
//         letters.add(0, "a");
//         letters.add(1, "b");
//         letters.add(2, "c");
//         letters.add(3, "d");
//         letters.add(4, "e");

//         reverseList(letters);
//     }

//     public static void reverseList(LinkedList<String> list) {
//         LinkedList<String> reversList = new LinkedList<>();

//         for (int i = 0; i < list.size(); i++) {
//             reversList.add(i, list.get(list.size() - 1 - i));
//         }
//         System.out.println(reversList);
//     }
// }

/**
 * task2:
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди.
 * dequeue() - возвращает первый элемент из очереди и удаляет его.
 * first() - возвращает первый элемент из очереди не удаляя.
 */

/**
public class Program {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers = enqueue(numbers, 2);
        numbers = enqueue(numbers, 4);
        numbers = enqueue(numbers, 1);
        System.out.println(numbers);

        int a = dequeue(numbers);
        System.out.println(a);
        System.out.println(numbers);

        int b = first(numbers);
        System.out.println(b);
        System.out.println(numbers);
    }

    public static Queue<Integer> enqueue(Queue<Integer> list, int element){
        list.add(element);
        return list;
    }

    public static int dequeue(Queue<Integer> list){
        return list.poll();
    }

    public static int first(Queue<Integer> list){
        return list.peek();
    }
}
*/