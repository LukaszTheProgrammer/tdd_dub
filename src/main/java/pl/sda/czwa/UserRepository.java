package pl.sda.czwa;

import java.util.Optional;

interface UserRepository {

    void save(User user);

    Optional<User> findByEmail(String email);
}
