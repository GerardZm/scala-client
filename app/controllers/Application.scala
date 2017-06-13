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

import org.asynchttpclient._
import org.asynchttpclient.request.body.multipart.part._
import org.asynchttpclient.request.body.multipart.FilePart

import scala.concurrent._
import scala.concurrent.duration._

/**
 * Controller responsible for handling client's requests to server
 * 
 * Used sources:
 * https://www.playframework.com/documentation/2.5.x/ScalaWS
 * https://www.playframework.com/documentation/2.5.x/ScalaFileUpload
 * http://www.javadoc.io/doc/org.asynchttpclient/async-http-client
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
     def get = Action {
	val request = wsClient.url(address).get()
	try {
        	val response = Await.result(request, 4 seconds)
		Ok(response.body)
	}
	catch {
		case e: java.net.ConnectException => Ok("Nie nawiazano polaczenia z serwerem.\nTresc bledu: " + e);
		case e: Exception => Ok("Wystapil blad: " + e);
	}
     }

    /**
     * HTTP POST request with empty body. On response code 201 redirect
     * to empty page containing response body.
     */
     def post = Action {
	val request = wsClient.url(address).post("")
	try {
        	val response = Await.result(request, 4 seconds)
		Ok(response.body)
	}
	catch {
		case e: java.net.ConnectException => Ok("Nie nawiazano polaczenia z serwerem.\nTresc bledu: " + e);
		case e: Exception => Ok("Wystapil blad: " + e);
	}
     }

    /**
     * HTTP POST request with file uploaded by user. On response code
     * 201 redirect to empty page containing response body (meanwhile
     * delete file uploaded by user).
     */

     def upload = Action(parse.multipartFormData) { request =>
	request.body.file("myfile").map { myfile =>
		val filename = myfile.filename
		val contentType = myfile.contentType
		try {
			myfile.ref.moveTo(new File(s"$filename"))
			val asyncHttpClient:AsyncHttpClient = wsClient.underlying
			val postBuilder = asyncHttpClient.preparePost(address + "/upload")
			val builder = postBuilder.addBodyPart(new FilePart("code", new File(s"$filename")))
			val response = asyncHttpClient.executeRequest(builder.build()).get();
			new File(s"$filename").delete()
			Ok(response.getResponseBody)
		}
		catch  {
			case e: java.util.concurrent.ExecutionException => Ok("Nie nawiazano polaczenia z serwerem.\nTresc bledu: " + e);
			case e: Exception => Ok("Wystapil blad: " + e);
		}
	}.getOrElse {
		Ok("Blad");
	}
     }
}
