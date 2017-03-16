package springscala

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Configuration
@ComponentScan(basePackages = Array("springscala"))
class Config

@Component
class ConvertFunction extends (String => String) {
  def apply(s: String): String = s
}

@Component
class AutowiredConversionConstructorBased @Autowired() (convert: String => String) {
  def run() = {
    System.out.printf("\n\nScala AutowiredConversionConstructorBased"
      + "\n-----------------------------------------")
    System.out.printf("\n     " + convert.apply("I'm converted"))
    System.out.printf("\n     Autowired: " + convert.getClass.toString + "\n\n")
  }
}

@Component
class AutowiredConversionPrivateFieldBased {
  @Autowired private val convert: String => String = null

  def run() = {
    System.out.printf("\n\nScala AutowiredConversionPrivateFieldBased"
      + "\n------------------------------------------")
    System.out.printf("\n     " + convert.apply("I'm converted"))
    System.out.printf("\n     Autowired: " + convert.getClass.toString + "\n\n")
  }
}
