name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

crossScalaVersions := Seq("2.10.4", "2.11.1")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.0" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
