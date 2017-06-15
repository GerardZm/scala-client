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
	"org.asynchttpclient" % "async-http-client" % "2.0.24",
	//"org.springframework" % "spring-mock" % "2.0.8",
	cache,
	specs2 % Test
)

PlayKeys.devSettings := Seq("play.server.http.port" -> "9001")
coverageExcludedPackages := "<empty>;Reverse.*;router\\.*"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.gzmuda.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.gzmuda.binders._"
