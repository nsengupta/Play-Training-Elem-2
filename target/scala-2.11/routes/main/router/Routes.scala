
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/nirmalya/PlayTraining/Java/PlayTrainingLab/my-attendees-app-1/conf/routes
// @DATE:Sat Mar 18 19:27:37 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  AttendeesController_2: controllers.AttendeesController,
  // @LINE:16
  AsyncController_1: controllers.AsyncController,
  // @LINE:22
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    AttendeesController_2: controllers.AttendeesController,
    // @LINE:16
    AsyncController_1: controllers.AsyncController,
    // @LINE:22
    Assets_0: controllers.Assets
  ) = this(errorHandler, AttendeesController_2, AsyncController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AttendeesController_2, AsyncController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.AttendeesController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.AttendeesController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """all""", """controllers.AttendeesController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """surname/""" + "$" + """sname<[^/]+>""", """controllers.AttendeesController.getBySurname(sname:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_AttendeesController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_AttendeesController_index0_invoker = createInvoker(
    AttendeesController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AttendeesController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AttendeesController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_AttendeesController_count1_invoker = createInvoker(
    AttendeesController_2.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AttendeesController",
      "count",
      Nil,
      "GET",
      """""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AttendeesController_getAll2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all")))
  )
  private[this] lazy val controllers_AttendeesController_getAll2_invoker = createInvoker(
    AttendeesController_2.getAll,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AttendeesController",
      "getAll",
      Nil,
      "GET",
      """""",
      this.prefix + """all"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AttendeesController_getBySurname3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("surname/"), DynamicPart("sname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AttendeesController_getBySurname3_invoker = createInvoker(
    AttendeesController_2.getBySurname(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AttendeesController",
      "getBySurname",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """surname/""" + "$" + """sname<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AsyncController_message4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message4_invoker = createInvoker(
    AsyncController_1.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AsyncController_message5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message5_invoker = createInvoker(
    AsyncController_1.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_AttendeesController_index0_route(params) =>
      call { 
        controllers_AttendeesController_index0_invoker.call(AttendeesController_2.index)
      }
  
    // @LINE:8
    case controllers_AttendeesController_count1_route(params) =>
      call { 
        controllers_AttendeesController_count1_invoker.call(AttendeesController_2.count)
      }
  
    // @LINE:10
    case controllers_AttendeesController_getAll2_route(params) =>
      call { 
        controllers_AttendeesController_getAll2_invoker.call(AttendeesController_2.getAll)
      }
  
    // @LINE:12
    case controllers_AttendeesController_getBySurname3_route(params) =>
      call(params.fromPath[String]("sname", None)) { (sname) =>
        controllers_AttendeesController_getBySurname3_invoker.call(AttendeesController_2.getBySurname(sname))
      }
  
    // @LINE:16
    case controllers_AsyncController_message4_route(params) =>
      call { 
        controllers_AsyncController_message4_invoker.call(AsyncController_1.message)
      }
  
    // @LINE:19
    case controllers_AsyncController_message5_route(params) =>
      call { 
        controllers_AsyncController_message5_invoker.call(AsyncController_1.message)
      }
  
    // @LINE:22
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
