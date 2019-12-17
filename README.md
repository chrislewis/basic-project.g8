# Basic Project

### Cut the bullshit and get to work!

This is a [giter8](http://www.foundweekends.org/giter8/index.html) template for removing
the boilerplate in setting up a new scala project, invokable via
[`sbt new`](https://www.scala-sbt.org/1.x/docs/sbt-new-and-Templates.html) since sbt 0.13.13.

## What you get

* sbt 1.3.4
* Scala 2.13.1
* [ScalaTest](http://www.scalatest.org/) with an example [FlatSpec](http://www.scalatest.org/user_guide/selecting_a_style)
* Project `name`, `group`, `package`, and `version` customizable as variables with defaults.
* Everything in your project's base package imported automatically in repl sessions.
* [Scalariform](http://scala-ide.org/scalariform/) with the [default settings](https://github.com/scala-ide/scalariform/blob/master/formatterPreferences.properties) set in `.scalariform`.
* "Recommended" `scalac` 2.13 compiler flags per [Nathan Kleyn](https://nathankleyn.com/2019/05/13/recommended-scalac-flags-for-2-13/), set in `scalac.sbt`.

## Motivation

There are many templates for bootstrapping Scala projects these days. However, that was not the case when I originally created this one back in 2011 and while I don't intend to vet every single one out there, I haven't seen one as opinionated as I'd like it to be.

My years of training engineers and leading teams in delivering various kinds of products have reinforced time and again this obvious truth: the more oppurtunities an engineer has to be distracted from the actual problem they want to solve, the more likely they are to be distracted.

I wish I could sum the total time I've heard discussion and debate in which the following questions were the subject:

* _"How should I format this code?"_
* _"Why is this file formatted this way instead of that way?"_
* _"How should I structure this project?"_
* _"What testing library and style should I use?"_
* _"What do all these compiler messages mean?"_

I used to engage in these, and I still do when someone wants to hash out the trade-offs. However, while I have my opinions, it was to the great benefit of my productivity when I decided to stop sweating the subjective things, adopt a standard, and hand over the enforcement of that standard to a tool. At least for the subjective things, a standard that doesn't meet all of my personal preferences is better than no standard at all. Standards lead to consistency across codebases, and consistency generally enables engineers to quickly understand the fundamentals of a new codebase, prececisely because they don't have to ask questions that distract from the actual problem.

This is the motivation for this template, whose goal is to remove at least some of these distracting questions.

## Contributing

Have I missed something? Do you see a way to remove even more common, distracting questions from an engineer's mind in this template? Send a PR or open an issue!
