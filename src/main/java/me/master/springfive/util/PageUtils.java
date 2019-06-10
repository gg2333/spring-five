package me.master.springfive.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PageUtils {

    public static Pageable simplePageable(int page, int size) {
        if (page <= 0) {
            page = 1;
        }

        if (size < 10) {
            size = 10;
        }

        return PageRequest.of(page, size);
    }


}
