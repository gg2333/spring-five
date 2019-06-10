package me.master.springfive.api;

import me.master.springfive.data.Gender;
import me.master.springfive.data.User;
import me.master.springfive.repo.UserRepository;
import me.master.springfive.resp.BaseResp;
import me.master.springfive.resp.PageResp;
import me.master.springfive.util.RxWrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/all")
    public Mono<PageResp<User>> users(
            @RequestParam("page") int page,
            @RequestParam("size") int size) {

        return Mono.just(userRepository.findAll(PageRequest.of(page, size)))
                .flatMap(RxWrappers.pager());
    }

    @GetMapping(path = "/user")
    public Optional<User> getUser(@RequestParam("id") String id) {
        return userRepository.findById(id);
    }

//    @PostMapping(path = "/add")
//    public void addUser(@RequestBody User user) {
//        userRepository.save(user);
//    }

    @PostMapping(path = "/add")
    public Mono<BaseResp> addUser() {

        User newUser = new User();
        newUser.setName("master");
        newUser.setEmail("master@me.com");
        newUser.setGender(Gender.MALE);

//        Date date = new Date();
//        newUser.setCreatedAt(date);
//        newUser.setUpdatedAt(date);

        userRepository.save(newUser);

        return Mono.just(BaseResp.success());
    }

}
