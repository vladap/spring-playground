package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * This example shows that @Autowired values can be hidden in Spring.
 * And it is widely used.
 * Unlike Scala implicit values which are visible in type signature.
 */
@Component
public class AutowiredConversionPrivateFieldBased {

  @Autowired
  private Function<String, String> convert;

  void run() {
    System.out.printf("\n\nAutowiredConversionPrivateFieldBased"
      + "\n------------------------------------");
    System.out.printf("\n     " + convert.apply("I'm converted"));
    System.out.printf("\n     Autowired: " + convert.getClass().toString() + "\n\n");
  }
}
