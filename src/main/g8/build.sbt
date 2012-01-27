name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.1"

libraryDependencies := Seq(
  "org.specs2" %% "specs2" % "1.7.1" % "test"
)

initialCommands := "import $organization$.$name$._"
