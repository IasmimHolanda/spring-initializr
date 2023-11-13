import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/random")
public class RandomNumberController {

    @GetMapping
    public int getRandomNumber() {
        // Gera um número aleatório entre 0 (inclusive) e 100 (exclusive)
        return new Random().nextInt(100);
    }
}
