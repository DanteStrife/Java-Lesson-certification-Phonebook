//
//Реализация очереди
//
//Инструкция по использованию платформы
//
//
//
//В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
//
//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя
//getElements() - возвращает все элементы в очереди
//        Пример
//
//
//queue.enqueue(1);
//queue.enqueue(10);
//queue.enqueue(15);
//queue.enqueue(5);
//System.out.println(queue.getElements());
//Результат:
//
//        [1, 10, 15, 5]
//        queue.dequeue();
//queue.dequeue();
//System.out.println(queue.getElements());
//Результат:
//
//        [15, 5]
//        System.out.println(queue.first());
//Результат:
//
//        15

import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    private LinkedList<Integer> ll = new LinkedList<>();
//
//    помещает элемент в конец очереди

    public void enqueue(int el){
        // Напишите свое решение ниже
        ll.add(el);
    }

    //
//    возвращает первый элемент из очереди и удаляет его
    public Integer dequeue(){
        // возвращает первый элемент из очереди и удаляет его
        return ll.removeFirst();
    }

    //    возвращает первый элемент из очереди, не удаляя
    public Integer first(){
        // возвращает первый элемент из очереди, не удаляя
        return ll.getFirst();
    }

    //    возвращает все элементы в очереди
    public LinkedList<Integer> getElements() {
        // возвращает все элементы в очереди
        return ll;
    }
}

