{
  val stage = TaskKey[Unit]("stage", "Prepares the project to be run, in environments that deploy source trees rather than packages.")
  stage in Compile := {}
}
