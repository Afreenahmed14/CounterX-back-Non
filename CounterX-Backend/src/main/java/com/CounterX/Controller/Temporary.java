import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbCheckController {

    @Autowired
    private Environment env;

    @GetMapping("/db-check")
    public String check() {
        return env.getProperty("spring.datasource.url");
    }
}
