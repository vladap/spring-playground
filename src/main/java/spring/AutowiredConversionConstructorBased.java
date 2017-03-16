package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * This example shows @Autowired for constructors.
 * Run() applies conversion function between String and String.
 * String is a type I don't have any control over.
 *
 * This converion function is injected "implicitly" by Spring runtime.
 *
 * Using constructor based DI is preferred approach.
 * Because it makes dependencies visible.
 */
@Component
public class AutowiredConversionConstructorBased {

  Function<String, String> convert;

  @Autowired
  public AutowiredConversionConstructorBased(Function<String, String> convert) {
    this.convert = convert;
  }

  void run() {
    System.out.printf("\n\nAutowiredConversionConstructorBased"
      + "\n-----------------------------------");
    System.out.printf("\n     " + convert.apply("I'm converted"));
    System.out.printf("\n     Autowired: "
      + convert.getClass().toString() + "\n\n");
  }
}
