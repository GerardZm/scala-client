/********************************************************/
/*           Projekt systemy rozproszone                */
/*                 Program Osoby 1                      */
/*               Autor: Gerard Żmuda                    */
/*                  czerwiec 2017                       */
/********************************************************/

package controllers

import javax.inject.Inject
import play.api.test._
import play.api.test.Helpers._
import play.api.libs.ws._
import play.api.libs.ws.ahc.AhcWSClient
import java.io.File

/**
 * Conduct unit tests
 * 
 * Used sources:
 * https://www.playframework.com/documentation/2.5.x/ScalaFunctionalTestingWithScalaTest
 * https://semaphoreci.com/community/tutorials/how-to-add-integration-tests-to-a-play-framework-application-using-scala
 */

class ApplicationSpec extends PlaySpecification {

  "Application" should {
	"render the index page from a new instance of controller" in {
		val controller = new Webpage
		val home = controller.index().apply(FakeRequest())

		status(home) must equalTo(OK)
		contentType(home) must equalTo(Some("text/html"))
		contentAsString(home) must contain ("Panel klienta")
	}

	"send HTTP GET request and receive response" in new WithServer {
   		val wsClient = AhcWSClient()
		val controller = new Application(wsClient)
		val get = controller.get.apply(FakeRequest())
		status(get) must equalTo(OK)
	}

	"send HTTP POST request and receive response" in new WithServer {
   		val wsClient = AhcWSClient()
		val controller = new Application(wsClient)
		val post = controller.post.apply(FakeRequest())
		status(post) must equalTo(OK)
	}
	
	/*"send HTTP POST request imitating FILE and receive response" in new WithServer {
   		val wsClient = AhcWSClient()
		val controller = new Application(wsClient)
		val response = Await.result(wsClient.url("127.0.0.1:9000").post(Map("code" -> Seq("test"))), 4 seconds)
		response.status must equalTo(OK)
	}*/

	/*"send HTTP POST request containing a FILE and receive response" in new WithServer {
   		val wsClient = AhcWSClient()
		val controller = new Application(wsClient)
		//val file = new File(s"test/utilities/unitTest.txt")
		val response = wsClient.url("127.0.0.1:9000/").post(Source(FilePart("code", "unitTest.scala", Option("text/plain"), FileIO.fromFile(file)) :: DataPart("key", "value") :: List()))
		val upload = controller.upload(multipartFile)
		status(upload) must equalTo(OK)
	}*/
  }
}
