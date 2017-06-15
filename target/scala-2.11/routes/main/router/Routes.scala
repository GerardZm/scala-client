
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Dawid/Projekt_Rozproszone/scala-client/conf/routes
// @DATE:Thu Jun 15 11:31:07 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:11
  Webpage_2: controllers.Webpage,
  // @LINE:14
  Assets_1: controllers.Assets,
  // @LINE:17
  Application_0: controllers.Application,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:11
    Webpage_2: controllers.Webpage,
    // @LINE:14
    Assets_1: controllers.Assets,
    // @LINE:17
    Application_0: controllers.Application
  ) = this(errorHandler, Webpage_2, Assets_1, Application_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Webpage_2, Assets_1, Application_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Webpage.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """get""", """controllers.Application.get"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """controllers.Application.post"""),
    ("""POST""", this.prefix, """controllers.Application.upload()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """batchUpload""", """controllers.Application.batchUpload()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:11
  private[this] lazy val controllers_Webpage_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Webpage_index0_invoker = createInvoker(
    Webpage_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Webpage",
      "index",
      Nil,
      "GET",
      """ Render the index page from a new instance of controller""",
      this.prefix + """"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path (SORCE: Play Framework Documentation)""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("get")))
  )
  private[this] lazy val controllers_Application_get2_invoker = createInvoker(
    Application_0.get,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "get",
      Nil,
      "GET",
      """ Map application routes to proper Actions""",
      this.prefix + """get"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_post3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val controllers_Application_post3_invoker = createInvoker(
    Application_0.post,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "post",
      Nil,
      "GET",
      """""",
      this.prefix + """post"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_upload4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_upload4_invoker = createInvoker(
    Application_0.upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_batchUpload5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("batchUpload")))
  )
  private[this] lazy val controllers_Application_batchUpload5_invoker = createInvoker(
    Application_0.batchUpload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "batchUpload",
      Nil,
      "POST",
      """ by Dawid Zych""",
      this.prefix + """batchUpload"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:11
    case controllers_Webpage_index0_route(params) =>
      call { 
        controllers_Webpage_index0_invoker.call(Webpage_2.index)
      }
  
    // @LINE:14
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_Application_get2_route(params) =>
      call { 
        controllers_Application_get2_invoker.call(Application_0.get)
      }
  
    // @LINE:18
    case controllers_Application_post3_route(params) =>
      call { 
        controllers_Application_post3_invoker.call(Application_0.post)
      }
  
    // @LINE:19
    case controllers_Application_upload4_route(params) =>
      call { 
        controllers_Application_upload4_invoker.call(Application_0.upload())
      }
  
    // @LINE:22
    case controllers_Application_batchUpload5_route(params) =>
      call { 
        controllers_Application_batchUpload5_invoker.call(Application_0.batchUpload())
      }
  }
}
