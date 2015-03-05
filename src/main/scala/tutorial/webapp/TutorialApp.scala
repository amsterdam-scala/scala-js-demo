package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    jQuery("body").append(s"<p>$text</p>")
  }

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  def main(): Unit = {
    appendPar(document.body, "Hello world!")
  }
}
