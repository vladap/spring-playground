package springjava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ContextConfiguration defines which @Configuration to use.
 * In Scala I would either import module or mixin a trait with implicits.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class SpringTest {

  @Autowired
  AutowiredConversionConstructorBased autowiredConversionConstructorBased;

  @Autowired
  AutowiredConversionPrivateFieldBased autowiredConversionPrivateFieldBased;

  @Test
  public void testIt() {
    autowiredConversionConstructorBased.run();
    autowiredConversionPrivateFieldBased.run();
  }

}
