package reactive.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

/**
 * Reactive Streams
 * 1. Asynchronous
 * 2. Non-blocking
 * 3. Handle backpressure
 * Publisher (create events) cold <- (subscribe) Subscriber
 * Subscription is created
 * Publisher (onSubscribe with subscription) -> Subscriber
 * Subscription <- (request N) Subscriber
 * Publisher -> (onNext) from Subscriber
 * until:
 * 1. Publisher sends all the objects requested.
 * 2. Publisher sends all the objects it has. (onComplete) subscriber and subscription will be cancelled
 * 3. There is an error, (onError) -> subscriber and subscription will be cancelled
 * Реактивное программирование в Project Reactor основано на концепциях реактивных потоков (Reactive Streams).
 * Эта парадигма программирования предназначена для обработки асинхронных событий и данных, обеспечивая не блокирующий
 * стиль программирования и управление обратной связью (backpressure), что позволяет эффективно обрабатывать потоки
 * данных и событий. Давай разберем основные аспекты реактивного программирования в Project Reactor, используя
 * комментарии из вашего кода:
 * Асинхронность (Asynchronous):
 * Реактивное программирование предназначено для обработки асинхронных событий, то есть событий, которые происходят в
 * нерегулярных интервалах и не блокируют основной поток выполнения программы.
 * Не блокирующий стиль (Non-blocking):
 * Вместо блокирования потока выполнения программы, реактивное программирование использует неблокирующие операции,
 * которые позволяют программе продолжать выполнение других задач, в то время как ожидаются результаты асинхронных
 * операций.
 * Управление обратной связью (Handle backpressure):
 * Обратная связь (backpressure) - это механизм, который позволяет получателю данных управлять темпом, с которым он
 * получает данные от отправителя, чтобы избежать переполнения. Это важный аспект реактивного программирования, который
 * позволяет балансировать нагрузку и предотвращать утечки памяти.
 * Ключевые компоненты реактивного программирования в Project Reactor:
 * Publisher (Издатель): Это источник данных или событий, который создает и отправляет поток данных или событий.
 * Subscriber (Подписчик): Это объект, который подписывается на Publisher и принимает и обрабатывает данные или события,
 * отправленные Publisher.
 * Subscription (Подписка): Это объект, который устанавливает связь между Publisher и Subscriber и предоставляет
 * возможность управлять обратной связью (например, запросами на получение данных).
 * Процесс взаимодействия между Publisher и Subscriber:
 * Publisher создает события или данные и устанавливает подписку (onSubscribe) с Subscription.
 * Subscriber запрашивает определенное количество данных (N) у Publisher, чтобы контролировать поток данных (управление
 * обратной связью).
 * Publisher отправляет данные (onNext) Subscriber до тех пор, пока:
 * Publisher отправит все запрошенные объекты.
 * Publisher отправит все доступные объекты и завершит поток (onComplete), в результате чего подписчик и подписка будут
 * отменены.
 * Возникнет ошибка (onError), в результате чего подписчик и подписка будут отменены.
 * Эта модель позволяет эффективно обрабатывать потоки данных и управлять ресурсами, предотвращая утечки памяти и
 * обеспечивая асинхронное, не блокирующее взаимодействие между компонентами системы.
 * */
@Slf4j // автоматизирует создание кода для логирования в проектах, использующих Simple Logging Facade for Java
public class MonoTest {
    @Test // JUnit, используется для обозначения методов, которые должны быть выполнены как тестовые случаи
    public void monoSubscriber() {
        String name = "William Suane";
        Mono<String> mono = Mono.just(name); // создает объект типа Mono в Project Reactor == асинхронное, реактивное значение
        // Mono.just(name): Это статический метод just класса Mono, который используется для создания Mono с
        // заданным значением. В данном случае, значение name будет упаковано в Mono.
        log.info("Mono {}", mono);
        log.info("Everything is working as intended");
    }
}