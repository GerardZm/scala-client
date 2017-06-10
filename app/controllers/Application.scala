/********************************************************/
/*           Projekt systemy rozproszone                */
/*                 Program Osoby 1                      */
/*               Autor: Gerard Żmuda                    */
/*                  czerwiec 2017                       */
/********************************************************/

package controllers

import javax.inject.Inject
import play.api._
import play.api.mvc._

import play.api.libs.ws._
import play.api.mvc.MultipartFormData

import java.io.File
import play.api.libs.Files.TemporaryFile

import scala.concurrent.ExecutionContext
import ExecutionContext.Implicits.global

/**
 * Controller responsible for handling client's requests to server
 * 
 * Used sources:
 * https://www.playframework.com/documentation/2.5.x/ScalaWS
 * https://www.playframework.com/documentation/2.5.x/ScalaFileUpload
 *
 * @param wsClient Responsible for HTTP request-response process handling
 */

class Application @Inject() (wsClient: WSClient) extends Controller {
    /**
     * Destination server address, change if needed
     */
     var address = "http://192.168.127.129:3000/code"

    /**
     * HTTP GET request with empty body. On response code 201 redirect
     * to empty page containing response body.
     */
     def get = Action.async {
        wsClient.url(address).get().map { response =>
	   Ok("Got response: " + response.body)
        }
     }

    /**
     * HTTP POST request with empty body. On response code 201 redirect
     * to empty page containing response body.
     */
     def post = Action.async {
         wsClient.url(address).post("").map { response =>
	   Ok("Got response: " + response.body)
	 }
     }

    /**
     * HTTP POST request with file uploaded by user. On response code
     * 201 redirect to empty page containing response body (meanwhile
     * delete file uploaded by user).
     */
     def upload = Action(parse.multipartFormData) { request =>
	  request.body.file("myfile").map { myfile =>
	    import java.io.File
	    val filename = myfile.filename
	    val contentType = myfile.contentType
	    myfile.ref.moveTo(new File(s"$filename"))
	    wsClient.url(address + "/upload")
			.post("$filename").map { response =>
		   new File(s"$filename").delete()
		   Ok("Got response: " + response.body)
	    }
	    Ok("File uploaded")
	  }.getOrElse {
		Ok("Blad");
	  }
     }

}
