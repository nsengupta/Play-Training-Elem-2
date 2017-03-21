
package views.html.attendees

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bysname_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class bysname extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/main("Player's Complete Name")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""

	"""),format.raw/*5.2*/("""<tbody>
		<name>"""),_display_(/*6.10*/name),format.raw/*6.14*/("""</name>
	</tbody>
	

""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


}

/**/
object bysname extends bysname_Scope0.bysname
              /*
                  -- GENERATED --
                  DATE: Sat Mar 18 22:56:41 IST 2017
                  SOURCE: /home/nirmalya/PlayTraining/Java/PlayTrainingLab/my-attendees-app-1/app/views/attendees/bysname.scala.html
                  HASH: 1428e590208a1b3518901b8258b1d17484566ac5
                  MATRIX: 759->1|868->15|896->18|934->48|973->50|1002->53|1045->70|1069->74
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6
                  -- GENERATED --
              */
          