# $name$

Welcome to your new project! Before you do anything else, change this readme!

Here are some quick notes about a couple of not-so-obvious things in your project.

### Scalariform

Your project is fitted with [scalariform](http://scala-ide.org/scalariform/), the Scala code formatting tool, with the [default settings](https://github.com/scala-ide/scalariform/blob/master/formatterPreferences.properties) set in [`.scalariform`](.scalariform). Every time your project is compiled, this tool will reformat any source files that do not conform to those formatting settings, so you don't have to think about it.

### Compiler Flags

There are a lot of useful flags that allow you to modify the behavior of the compiler. For some years now, the Scala community has worked to surface and agree upon those that should _always_ be in use; these are generally meant to prevent a number of programming mistakes, code rot, etc. Your project has configured the compiler to use the [recommended flags]((https://nathankleyn.com/2019/05/13/recommended-scalac-flags-for-2-13/)) for Scala 2.13. These flags are set in [`scalac.sbt`](scalac.sbt).
