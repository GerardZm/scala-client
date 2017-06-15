
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /* * This template is rendered from Webpage controller. * It calls for content of /main.scala.html/ file and * returns data
as rendered webpage. * * Used sources: * https://github.com/playframework/play-scala-starter-example/blob/2.5.x/app/views/index.scala.html
*/
  def apply/*3.5*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.7*/(""" """),_display_(/*3.9*/main("Panel uzytkownika")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
"""),format.raw/*4.1*/("""<div class="container">
	<div class="jumbotron">
		<div class="row">
			<div style="padding:20px" class="text-center">
				<h2>Co chcesz zrobic?</h2>
				<div class="col-md-12" style="margin-bottom: 15px">
					<a href=""""),_display_(/*10.16*/routes/*10.22*/.Application.get),format.raw/*10.38*/(""""><button type="button" class="btn btn-lg btn-primary">GET</button></a>
				</div>
				<div class="col-md-12" style="margin-bottom: 15px">
					<a href=""""),_display_(/*13.16*/routes/*13.22*/.Application.post),format.raw/*13.39*/(""""><button type="button" class="btn btn-lg btn-primary">POST</button></a>
				</div>

				<div class="col-md-12" style="margin-bottom: 15px">
					"""),_display_(/*17.7*/helper/*17.13*/.form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*17.89*/ {_display_(Seq[Any](format.raw/*17.91*/("""
					"""),format.raw/*18.6*/("""<p>Wybierz plik:&nbsp;<label class="btn btn-primary btn-file" style="width: 100px;">
					<span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span><input type="file" name="myfile" style="display: none;">
		</label>
						<input type="submit" value="Prześlij" class="btn btn-lg btn-primary"></p>
					""")))}),format.raw/*22.7*/("""
				"""),format.raw/*23.5*/("""</div>

			</div>
		</div>
	</div>

	<!-- part by Dawid Zych -->
	<div class="jumbotron text-center">
		<h2 class="text-center">Przesyłanie wielu plików na raz</h2>

		<p>Wybierz pliki, możesz ich przesłać ile chcesz</p>
			"""),_display_(/*34.5*/helper/*34.11*/.form(action = routes.Application.batchUpload, 'enctype -> "multipart/form-data")/*34.92*/ {_display_(Seq[Any](format.raw/*34.94*/("""
				"""),format.raw/*35.5*/("""<div class="btn-group" role="group">
			<label class="btn btn-primary btn-lg btn-file ">
					<span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>
					<input multiple="multiple" type="file" accept=".scala" name="myfile" style="display: none;">
					</label>
			<input type="submit" value="Prześlij" class="btn btn-lg btn-primary"> 
		</div> """)))}),format.raw/*41.11*/("""


	"""),format.raw/*44.2*/("""</div>
</div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/* * This template is rendered from Webpage controller. * It calls for content of /main.scala.html/ file and * returns data
as rendered webpage. * * Used sources: * https://github.com/playframework/play-scala-starter-example/blob/2.5.x/app/views/index.scala.html
*/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Jun 15 15:38:14 CEST 2017
                  SOURCE: C:/RozproszoneTest/scala-client/app/views/index.scala.html
                  HASH: dac0a48d4164affd2881c1b2f228c36d70fcb6d6
                  MATRIX: 783->269|879->271|906->273|939->298|978->300|1006->302|1260->529|1275->535|1312->551|1496->708|1511->714|1549->731|1726->882|1741->888|1826->964|1866->966|1900->973|2250->1293|2283->1299|2545->1535|2560->1541|2650->1622|2690->1624|2723->1630|3123->1999|3157->2006
                  LINES: 22->3|27->3|27->3|27->3|27->3|28->4|34->10|34->10|34->10|37->13|37->13|37->13|41->17|41->17|41->17|41->17|42->18|46->22|47->23|58->34|58->34|58->34|58->34|59->35|65->41|68->44
                  -- GENERATED --
              */
          