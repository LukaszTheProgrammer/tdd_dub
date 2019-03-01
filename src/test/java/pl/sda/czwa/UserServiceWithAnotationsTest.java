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
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceWithAnotationsTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void shouldBeAbleToCreateNewUser() {
        //when
        userService.create("John", "john@email.com", 29);
        //then
        verify(userRepository, times(1)).save(new User("John", "john@email.com", 29));
    }

    @Test
    public void shouldFindAUser() {
        //given
        Optional<User> john = Optional.of(new User("john", "john@email.com", 29));
        when(userRepository.findByEmail(anyString())).thenReturn(john);
        
        //when
        Optional<User> maybeUser = userService.findByEmail("john@email.com");

        //then
        assertTrue(maybeUser.isPresent());
    }

}