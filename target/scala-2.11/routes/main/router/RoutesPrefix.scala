
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/nirmalya/PlayTraining/Java/PlayTrainingLab/my-attendees-app-1/conf/routes
// @DATE:Sat Mar 18 19:27:37 IST 2017


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
