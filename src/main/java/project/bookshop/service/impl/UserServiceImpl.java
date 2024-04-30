package project.bookshop.service.impl;

import org.springframework.stereotype.Service;
import project.bookshop.repository.UserRepository;
import project.bookshop.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    private  final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
