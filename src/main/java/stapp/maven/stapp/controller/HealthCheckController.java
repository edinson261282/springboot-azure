package stapp.maven.stapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health-check")
public class HealthCheckController {

    @Value("${stapp.url}")
    private String url;

    @GetMapping("/")
    public ResponseEntity<?> index() {
        return new ResponseEntity<>("Hola mundo! " + this.url, HttpStatus.OK);
    }

}
