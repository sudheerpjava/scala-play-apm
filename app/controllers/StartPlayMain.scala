package controllers

import co.elastic.apm.api.Transaction

object StartPlayMain extends App {
  println("Hello, World!")

  import co.elastic.apm.api.ElasticApm

  val transaction = ElasticApm.startTransaction
  try {
    transaction.setName("HomeController#explore")
    transaction.setType(Transaction.TYPE_REQUEST)
  } catch {
    case e: Exception =>
      transaction.captureException(e)
      throw e
  }

  println("=========Test Main =======");
}
