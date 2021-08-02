package Service;

import Models.User;
import Repository.UserRepo;
import Exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public UserService() {
    }
    public void addUser(User newUser) throws UserAlreadyExistsException {
        if (userRepository.existsById(newUser.getUserId())) {
            throw new UserAlreadyExistsException(newUser.getUserId());
        }
        userRepository.save(newUser);
    }

    public List<User> getallUser(){
        return userRepository.findAll();
    }

    public User searchUser(long userId) {
        if(userRepository.existsById(userId)){
            userRepository.findById(userId);
        }
        throw new UserNotFoundException(userId);
    }

    public User deleteUser(long userId) {
        if(userRepository.existsById(userId)){
            userRepository.deleteById(userId);
        }
        throw new UserNotFoundException(userId);
    }

}

