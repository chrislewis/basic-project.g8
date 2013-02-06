name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
