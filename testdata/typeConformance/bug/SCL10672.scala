trait SomeClass

trait LocalProvider {
  self: SomeClass =>

  abstract class LocalTrait[A]

  object LocalTraitObject2 extends LocalProvider.this.LocalTrait[String]

}

class LocalUsage extends LocalProvider with SomeClass {
  /*caret*/val y: LocalTrait[String] = LocalTraitObject2
}
// True
