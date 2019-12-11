name := "$name;format="snake"$"

organization := "$group;format="snake"$"

version := "$version$"

scalaVersion := "2.13.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"

initialCommands := "import $group$.$name;format="lower,word"$._"
