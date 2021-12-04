name := "$name;format="snake"$"

organization := "$group$"

version := "$version$"

scalaVersion := "2.13.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"

scalafmtOnCompile := true

initialCommands := "import $package$._"
