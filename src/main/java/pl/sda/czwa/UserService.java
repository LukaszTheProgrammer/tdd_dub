package pl.sda.czwa;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void create(String name, String email, int age) {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("name can't be empty");
        }
        if (StringUtils.isEmpty(email)) {
            throw new IllegalArgumentException("email can't be empty");
        }
        if (age < 18){
            throw new IllegalArgumentException("user must be adult");
        }

        User user = new User(name, email, age);

        userRepository.save(user);
    }

    Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
