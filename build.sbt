import BNFC._

lazy val commonOptions = Seq(
  "-language:existentials",
  "-language:higherKinds",
//  "-Xfatal-warnings",
  "-Xfuture",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused-import",
  "-Ywarn-value-discard",
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked")

lazy val consoleOptions = commonOptions diff Seq("-Ywarn-unused-import")

lazy val commonSettings = Seq(
  name := "rholang",
  organization := "com.synereo",
  scalaVersion := "2.11.8",
  crossScalaVersions := Seq("2.10.6", scalaVersion.value),
  scalacOptions := commonOptions,
  scalacOptions in (Compile, console) := consoleOptions,
  scalacOptions in (Test, console) := consoleOptions)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(bnfcSettings: _*)

// Scalaz
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.4"
// Flex & Cup
libraryDependencies += "cup" % "java-cup-11a" % "local" from "file:/usr/share/java/cup.jar"
libraryDependencies += "jlex" % "JLex-local" % "local" from "file:/usr/share/java/JLex.jar"

// Kind projector
resolvers += Resolver.sonatypeRepo("releases")
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.8.0")
