package spring;

import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * @Component makes class available for @ComponentSearch.
 * It is similar to Scala implicit keyword which enables instances
 * and defs for implicit search.
 *
 * It would be an implicit instance already in Scala.
 * Here it is a class because Spring creates instances instead.
 *
 * This approach make sense only if there is need to swap
 * implementations on runtime. Otherwise it is an overkill
 * to @Autowire such simple functions.
 */
@Component
public class ConvertFunction implements Function<String, String> {

  @Override
  public String apply(String s) {
    return s;
  }
}

