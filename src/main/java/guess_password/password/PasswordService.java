package guess_password.password;

import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PasswordService {

    private final PasswordRepository passwordRepository;

    public PasswordService(PasswordRepository passwordRepository) {
        this.passwordRepository = passwordRepository;
    }
}
