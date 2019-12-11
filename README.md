This is a [giter8](http://www.foundweekends.org/giter8/index.html) template for removing
the boilerplate in setting up a new scala project, invokable via
[`sbt new`](https://www.scala-sbt.org/1.x/docs/sbt-new-and-Templates.html) since sbt 0.13.13.

* sbt 1.3.4
* Scala 2.13.1
* [ScalaTest](http://www.scalatest.org/) with an example [FlatSpec](http://www.scalatest.org/user_guide/selecting_a_style)
* Project `name`, `group`, `package`, and `version` customizable as variables with defaults.
* Everything in your project's base package imported automatically in repl sessions.
* [Scalariform](http://scala-ide.org/scalariform/) with the [default settings](https://github.com/scala-ide/scalariform/blob/master/formatterPreferences.properties) set in `.scalariform`.
* "Recommended" `scalac` 2.13 compiler flags per [Nathan Kleyn](https://nathankleyn.com/2019/05/13/recommended-scalac-flags-for-2-13/), set in `scalac.sbt`.