
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/laralagioia/webapps/playLabs2017 - Lab2/conf/routes
// @DATE:Fri Nov 17 15:12:39 GMT 2017


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
