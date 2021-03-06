package cycles


import globals.context
import models.buildActions.BuildAction
import org.specs2.mutable.Specification
import play.api.test.Helpers._


class ConfigurableCyclesSpec extends Specification {

  "Configurable cycles" should {
    "be correctly read from config" in context {
      running(context.fakeApp) {
        val cycles = BuildAction.branchCycles

        val parameters = cycles.map(_.parameters)

        (cycles must not).beNull
        (parameters must not).beNull
      }
    }
  }
}