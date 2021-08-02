package Controller;

import Models.User;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public UserService getUserService(){
        return userService;
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User newUser) {
        userService.addUser(newUser);
    }

    @GetMapping("/")
    @CrossOrigin
    public List<User> getallUser(){
        return userService.getallUser();
    }

    @GetMapping("/User/{useId}")
    public User searchUser(@PathVariable long userId) {
        return userService.searchUser(userId);
    }

    @DeleteMapping("/User/{useId}")
    public User deleteUser(@PathVariable long userId) {
        return userService.deleteUser(userId);
    }
}

