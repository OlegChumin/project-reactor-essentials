package reactive.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

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
 * */
@Slf4j
public class MonoTest {
    @Test
    public void test() {
        log.info("Everything is working as intended");
    }
}
