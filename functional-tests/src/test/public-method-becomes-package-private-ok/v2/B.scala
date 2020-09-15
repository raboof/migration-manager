package bar

abstract class C

trait B extends C {
  protected[bar] def defaultPort: Int
}

object B {
}
