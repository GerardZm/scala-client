
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/RozproszoneTest/scala-client/conf/routes
// @DATE:Thu Jun 15 15:36:51 CEST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseWebpage Webpage = new controllers.ReverseWebpage(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseWebpage Webpage = new controllers.javascript.ReverseWebpage(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
