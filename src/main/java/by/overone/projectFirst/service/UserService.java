package by.overone.projectFirst.service;

import by.overone.projectFirst.Repository.UserRepository;
import by.overone.projectFirst.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser (User user){
        return userRepository.save(user);
    }
//for delete
    public void deleteById(String id){
        userRepository.deleteById(id);

    }
    //for edition
    public User findById(String id){
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("user id not found"));
    }
    public List<User> findAll(){
        return userRepository.findAll();

    }
}
