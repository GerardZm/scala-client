
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
				    """),_display_(/*11.10*/helper/*11.16*/.form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*11.92*/ {_display_(Seq[Any](format.raw/*11.94*/("""
					"""),format.raw/*12.6*/("""<p>Wybierz plik:&nbsp;<label class="btn btn-primary btn-file" style="width: 100px;">
					
					<label class="btn btn-primary btn-lg btn-file ">
						<span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>
						<input type="file" name="myfile" style="display: none;">
					</label>
					<input type="submit" value="Prześlij" class="btn btn-lg btn-primary"> 
				    """)))}),format.raw/*19.10*/("""
				"""),format.raw/*20.5*/("""</div>

			</div>
		</div>
	</div>

	<!-- part by Dawid Zych -->
	<div class="jumbotron text-center">
		<h2 class="text-center">Przesyłanie wielu plików na raz</h2>

		<p>Wybierz pliki, możesz ich przesłać ile chcesz</p>
			"""),_display_(/*31.5*/helper/*31.11*/.form(action = routes.Application.batchUpload, 'enctype -> "multipart/form-data")/*31.92*/ {_display_(Seq[Any](format.raw/*31.94*/("""
				"""),format.raw/*32.5*/("""<div class="btn-group" role="group">
			<label class="btn btn-primary btn-lg btn-file ">
					<span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>
					<input multiple="multiple" type="file" accept=".scala" name="myfile" style="display: none;">
					</label>
			<input type="submit" value="Prześlij" class="btn btn-lg btn-primary"> 
		</div> """)))}),format.raw/*38.11*/("""


	"""),format.raw/*41.2*/("""</div>
</div>
""")))}),format.raw/*43.2*/("""
"""))
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
                  DATE: Thu Jun 15 13:15:29 PDT 2017
                  SOURCE: /home/gerard/scala/scala-client/app/views/index.scala.html
                  HASH: ff16ce75353b1dec953eae2ff335128e6f5bced2
                  MATRIX: 781->267|877->269|904->271|937->296|976->298|1003->299|1246->515|1261->521|1346->597|1386->599|1419->605|1836->991|1868->996|2119->1221|2134->1227|2224->1308|2264->1310|2296->1315|2690->1678|2721->1682|2766->1697
                  LINES: 22->3|27->3|27->3|27->3|27->3|28->4|35->11|35->11|35->11|35->11|36->12|43->19|44->20|55->31|55->31|55->31|55->31|56->32|62->38|65->41|67->43
                  -- GENERATED --
              */
          