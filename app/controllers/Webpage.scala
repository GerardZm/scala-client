/********************************************************/
/*           Projekt systemy rozproszone                */
/*                 Program Osoby 1                      */
/*               Autor: Gerard Żmuda                    */
/*                  czerwiec 2017                       */
/********************************************************/

/**
 * Controller responsible for rendering HTML page on client request
 * 
 * Used sources:
 * https://github.com/playframework/play-scala-starter-example/blob/2.5.x/app/controllers/HomeController.scala
 * https://scalaplayschool.wordpress.com/2014/08/24/lesson-11-template-for-scala-play-bootstrap-angularjs/
 */

package controllers

import javax.inject.Inject
import play.api._
import play.api.mvc._

class Webpage @Inject() extends Controller {

    /**
     *  Render HTML page on client request
     */
     def index = Action { implicit request =>
        Ok(views.html.index())
     }
}
