// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.15")

// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.13.1")
addSbtPlugin("org.irundaia.sbt" % "sbt-sassify" % "1.4.11")
addSbtPlugin("com.typesafe.play" % "sbt-play-ebean" % "6.2.0-RC4")