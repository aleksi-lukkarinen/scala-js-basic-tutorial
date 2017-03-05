package tutorial.webapp


import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery


object TutorialApp extends JSApp {

    def addClickedMessage(): Unit = {
        jQuery("body").append("<p>Nappia painettiin!</p>")
    }

    def setupUI(): Unit = {
        jQuery("""<button type="button">Click me!</button>""")
                    .click(addClickedMessage _)
                    .appendTo(jQuery("body"))
        jQuery("body").append("<p>Hello World</p>")
    }

    def main(): Unit = {
      jQuery(setupUI _)
    }

}
