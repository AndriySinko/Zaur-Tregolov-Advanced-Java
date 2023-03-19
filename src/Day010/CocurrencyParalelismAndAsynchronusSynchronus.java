package Day010;

public class CocurrencyParalelismAndAsynchronusSynchronus {
    /**
     * В многопочности есть такие понятия как :
     *      1.Concurrency - (Выполнене сразу нескольких задач, достигатся может разными способами)
     *      2.Parallelism - (Выполнение 2-х и более задач в одно и то же время - паралельно)
     * Пример:
     *      1.Есть и петь - (Выплнения этих задач одновременно невозможно, но возможнл по принципу context switch - выполения
     * сначала 1 дейстивия, потом 2, потом обратно 1. Это является Concurrency, но достигается принципом context switch)
     *
     *      2.Готовить и говорить по телефону - (Выполения этих задач производится паралельно(одновременно) Это тоже
     * является Concurrency но достигается принципом parallelism)
     *
     * Так же есть понятия как
     *      1.Synchronous - (Выполнение задачи постепенно как вы обычных потоках(нужно ждать выполнения 1 чтобы выполнить 2))
     *      2.Asynchronous - (Выполнение задачи не паралельно не дожидаясь окончания 1 задачи)
     * Пример:
     *      1.Писать 2 письма - (чтобы написать 2 письма нужно написать сначала 1 потом 2 - принцип Synchronous)
     *      2.Писать письмо и стирать - (можно поставить стирать, и недожидаясь конца стирки пойти писать письмо - Asynchronous)
     *
     * В многоядерных процессорах Concurrency достигается принципом Parallelism и Asynchronous (Одновременное выполнения
     *  2 задач, или выполениния 2 задач так что-бы выполнить 2 задачу не нужно дожидтся конца первой)
     */
}