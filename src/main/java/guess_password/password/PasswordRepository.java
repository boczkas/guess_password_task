package guess_password.password;

import org.springframework.stereotype.Repository;

@Repository
public class PasswordRepository {

    private Password password;
    private Password currentGuess;
}
