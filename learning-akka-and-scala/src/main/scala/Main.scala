import akka.actor.typed.ActorSystem
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

object HelloAkka {
  def apply(): Behavior[String] = Behaviors.receive { (context, message) =>
    context.log.info(s"Received: $message")
    Behaviors.same
  }
}

object Main extends App {
  val system: ActorSystem[String] = ActorSystem(HelloAkka(), "helloAkka")
  system ! "Hello, Akka!"
}
