{
  println(/* resolved: false */ Actor.getClass)
  println(classOf[/* resolved: false */ Actor])

  import actors.Actor

  println(/* */ Actor.getClass)
  println(classOf[/* */ Actor])
}