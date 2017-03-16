package springscala

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(classes = Array(classOf[Config]))
class SpringTest {

  @Autowired
  private val autowiredConversionConstructorBased: AutowiredConversionConstructorBased = null

  @Autowired
  private val autowiredConversionPrivateFieldBased: AutowiredConversionPrivateFieldBased = null

  @Test
  def testIt(): Unit = {
    autowiredConversionConstructorBased.run()
    autowiredConversionPrivateFieldBased.run()
  }

}
