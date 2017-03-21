
package views.html.attendees

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object count_Scope0 {
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

class count extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(count: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/main("Attendees")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	"""),format.raw/*4.2*/("""<tbody>"""),_display_(/*4.10*/count),format.raw/*4.15*/("""</tbody>
""")))}))
      }
    }
  }

  def render(count:Int): play.twirl.api.HtmlFormat.Appendable = apply(count)

  def f:((Int) => play.twirl.api.HtmlFormat.Appendable) = (count) => apply(count)

  def ref: this.type = this

}


}

/**/
object count extends count_Scope0.count
              /*
                  -- GENERATED --
                  DATE: Sat Mar 18 19:27:38 IST 2017
                  SOURCE: /home/nirmalya/PlayTraining/Java/PlayTrainingLab/my-attendees-app-1/app/views/attendees/count.scala.html
                  HASH: f7912b8ab4ad7bdcd8ad7da4f0adcc4aaab404fb
                  MATRIX: 752->1|859->13|887->16|912->33|951->35|979->37|1013->45|1038->50
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4
                  -- GENERATED --
              */
          