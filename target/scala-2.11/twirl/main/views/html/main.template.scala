
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the /index/ template. This
 * template handles the rendering of page's repeatable
 * content (HTML header and body tags, webpage navigation).
 *
 * Used sources:
 * https://github.com/playframework/play-scala-starter-example/blob/2.5.x/app/views/main.scala.html
 */
  def apply/*10.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*10.32*/("""

"""),format.raw/*12.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*15.13*/title),format.raw/*15.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("lib/bootstrap/css/bootstrap.min.css")),format.raw/*16.112*/("""">
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("lib/bootstrap/js/bootstrap.min.js")),format.raw/*17.79*/("""" crossorigin="anonymous"></script>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("images/favicon.png")),format.raw/*18.100*/("""">
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Nawigacja</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" style=" color: #9d9d9d;">Panel klienta - K1</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
         <ul class="nav navbar-nav navbar-right">
         </ul>
        </div>
      </div>
    </nav>
    <div style = "padding-top: 80px;">
	"""),_display_(/*39.3*/content),format.raw/*39.10*/("""
    """),format.raw/*40.5*/("""</div>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the /index/ template. This
 * template handles the rendering of page's repeatable
 * content (HTML header and body tags, webpage navigation).
 *
 * Used sources:
 * https://github.com/playframework/play-scala-starter-example/blob/2.5.x/app/views/main.scala.html
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Jun 15 13:15:29 PDT 2017
                  SOURCE: /home/gerard/scala/scala-client/app/views/main.scala.html
                  HASH: 89c516743337fe130fbe45368842012cb71888ca
                  MATRIX: 827->303|953->333|982->335|1051->377|1077->382|1162->440|1177->446|1255->502|1303->523|1318->529|1393->583|1510->673|1525->679|1586->718|2411->1517|2439->1524|2471->1529
                  LINES: 27->10|32->10|34->12|37->15|37->15|38->16|38->16|38->16|39->17|39->17|39->17|40->18|40->18|40->18|61->39|61->39|62->40
                  -- GENERATED --
              */
          