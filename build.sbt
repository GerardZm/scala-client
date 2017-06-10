name := """scala-client"""
organization := "com.gzmuda"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
	ws,
	filters,
	"org.webjars" % "jquery" % "2.2.3",
	"org.webjars" % "bootstrap" % "3.3.7",
	//"com.ning" % "async-http-client" % "1.0.0",
	cache,
	specs2 % Test
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.gzmuda.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.gzmuda.binders._"
