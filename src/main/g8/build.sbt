name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.13.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"

initialCommands := "import $organization$.$name;format="lower,word"$._"
