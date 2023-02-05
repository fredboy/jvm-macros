organization  := "org.toktok"
name          := "macros"
version       := "0.1.1"
scalaVersion  := "2.12.17"

resolvers += Resolver.mavenLocal
publishMavenStyle := true
publishM2Configuration := publishM2Configuration.value.withOverwrite(true)

// Build dependencies.
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
)

// Test dependencies.
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.15"
) map (_ % Test)

import im.tox.sbt.Scalastyle
Scalastyle.projectSettings
