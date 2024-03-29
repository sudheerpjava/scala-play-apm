package controllers

import co.elastic.apm.agent.impl.ElasticApmTracer
import co.elastic.apm.api.{CaptureSpan, Transaction}
import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /*import co.elastic.apm.api.ElasticApm
  val transaction = ElasticApm.startTransaction
  try {
    transaction.setName("HomeController#explore")
    transaction.setType(Transaction.TYPE_REQUEST)
  } catch {
    case e: Exception =>
      transaction.captureException(e)
      throw e
  }*/
  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok("views.html.explore()")
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }
  
}
