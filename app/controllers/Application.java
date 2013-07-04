package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render());
    }
  
  	public static Result helloworld() {
        return ok(playTemplate.render("Your new application is ready."));
    }
}
