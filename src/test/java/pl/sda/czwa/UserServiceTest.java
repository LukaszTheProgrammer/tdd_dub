package pl.sda.czwa;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {

    private UserService userService;
    private UserRepository userRepository;

    @Before
    public void setup() {
        userRepository = mock(UserRepository.class);
        userService = new UserService(userRepository);
    }

    @Test
    public void shouldBeAbleToCreateNewUser() {
        //when
        userService.create("John", "john@email.com", 29);
        //then
        verify(userRepository, times(1))
            .save(new User("John", "john@email.com", 29));
    }

    @Test
    public void shouldFindAUser() {
        //given
        Optional<User> maybeJohn = Optional.of(john());
        when(userRepository.findByEmail(anyString()))
            .thenReturn(maybeJohn);

        //when
        Optional<User> maybeUser = userService.findByEmail("john@email.com");

        //then
        assertTrue(maybeUser.isPresent());
    }

    private User john() {
        return new User("john", "john@email.com", 29);
    }

}