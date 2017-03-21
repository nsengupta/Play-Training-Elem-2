
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/nirmalya/PlayTraining/Java/PlayTrainingLab/my-attendees-app-1/conf/routes
// @DATE:Sat Mar 18 19:27:37 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAttendeesController AttendeesController = new controllers.ReverseAttendeesController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAttendeesController AttendeesController = new controllers.javascript.ReverseAttendeesController(RoutesPrefix.byNamePrefix());
  }

}
