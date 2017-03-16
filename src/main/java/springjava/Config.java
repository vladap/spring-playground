package springjava;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ComponentScan searches the whole scope created by @Component annotations.
 * In case there are multiple candidates than Spring Context fails on startup.
 *
 * @Import annotation can import other Configuration classes.
 * Similarly like I can import Scala implicits from other modules (objects).
 *
 * I haven't tried it but I assume that inheritance would works as well.
 * Compared to @Import it would be limited to single inheritance.
 * Maybe Java8 default methods in interfaces could be used as well to compose Configuration.
 */
@Configuration
@ComponentScan(basePackages = "springjava")
public class Config {}
