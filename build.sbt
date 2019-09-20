name := """play-scala-seed"""
organization := "controllers"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.0"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
// https://mvnrepository.com/artifact/co.elastic.apm/apm-agent-api
libraryDependencies += "co.elastic.apm" % "apm-agent-api" % "1.9.0"
// https://mvnrepository.com/artifact/co.elastic.apm/elastic-apm-agent
libraryDependencies += "co.elastic.apm" % "elastic-apm-agent" % "1.9.0"
