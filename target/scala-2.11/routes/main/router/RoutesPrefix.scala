
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gerard/scala/scala-client/conf/routes
// @DATE:Thu Jun 15 13:15:27 PDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
