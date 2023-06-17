package guess_password.password;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class PasswordController {

    private final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @GetMapping("/password")
    @ResponseBody
    public Password getPassword() {
        // TODO#1:
        //        Napisz implementację, która będzie zwracać nowe losowe słowo z WordList.getWORDS()

        // TODO#2:
        //        Przerób swoją implementację z poprzedniego zadania tak, aby hasło było zapisane
        //        i stałe w czasie pojedynczego uruchomienia aplikacji.
        //        Na front end powinno być zwracane w postaci:
        //        ??? ?? ????
        //        dla
        //        ala ma kota
        //        Zapisz również postać "pytajnikową" w currentGuess
        return null;
    }

    @PostMapping("/guess")
    @ResponseBody
    public Password guess(@RequestBody String letter) {
        // TODO#3:
        //        Dopisz implementację sprawdzającą, czy podana litera istnieje w haśle
        //        Zwróć hasło, które będzie miało odsłonięte odgadnięte do tej pory litery
        return null;
    }

    @PostMapping("/guess/password")
    @ResponseBody
    public boolean guessPassword(@RequestBody String password) {
        // TODO#4:
        //      napisz implementację sprawdzającą, czy próba odgadnięcia hasła jest prawidłowa
        return false;
    }
}
