package me.master.springfive.util;

import me.master.springfive.resp.BaseResp;
import me.master.springfive.resp.PageResp;
import org.springframework.data.domain.Page;
import reactor.core.publisher.Mono;

import java.util.function.Function;

public class RxWrappers {

    public static <T> Function<T, Mono<? extends BaseResp<T>>> baser() {
        return new Function<T, Mono<? extends BaseResp<T>>>() {
            @Override
            public Mono<? extends BaseResp<T>> apply(T t) {
                return Mono.just(BaseResp.create(t));
            }
        };
    }

    public static <T> Function<Page<T>, Mono<? extends PageResp<T>>> pager() {
        return new Function<Page<T>, Mono<? extends PageResp<T>>>() {
            @Override
            public Mono<? extends PageResp<T>> apply(Page<T> ts) {
                return Mono.just(PageResp.success(ts));
            }
        };
    }

}
