
package views.html.attendees

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(names: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/main("Key Players")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

	"""),format.raw/*5.2*/("""<h2>All products</h2>
	<table class="table table-striped">
	<thead>
		<tr>
			<th>Names</th>
		</tr>
	</thead>
	<tbody>
	"""),_display_(/*13.3*/for(name <- names) yield /*13.21*/ {_display_(Seq[Any](format.raw/*13.23*/("""
	    """),format.raw/*14.6*/("""<tr>
	    	<td>
	    		<a href=""""),_display_(/*16.18*/routes/*16.24*/.AttendeesController.getAll),format.raw/*16.51*/("""">
					"""),_display_(/*17.7*/name),format.raw/*17.11*/("""
				"""),format.raw/*18.5*/("""</a><
	    	</td>
	    </tr>
		
	""")))}),format.raw/*22.3*/("""
	

""")))}))
      }
    }
  }

  def render(names:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(names)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (names) => apply(names)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Sat Mar 18 19:27:38 IST 2017
                  SOURCE: /home/nirmalya/PlayTraining/Java/PlayTrainingLab/my-attendees-app-1/app/views/attendees/list.scala.html
                  HASH: 2a99cd86f48afdcb9ede04144380d95bee04aea7
                  MATRIX: 759->1|875->22|903->25|930->44|969->46|998->49|1146->171|1180->189|1220->191|1253->197|1313->230|1328->236|1376->263|1411->272|1436->276|1468->281|1532->315
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|44->13|44->13|44->13|45->14|47->16|47->16|47->16|48->17|48->17|49->18|53->22
                  -- GENERATED --
              */
          