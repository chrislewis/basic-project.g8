name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.0-1")

libraryDependencies := Seq(
  "org.specs2" %% "specs2" % "1.6.1" % "test",
  "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test
)

initialCommands := "import $organization$.$name$._"
