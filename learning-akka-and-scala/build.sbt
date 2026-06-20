name := "akka-hello"

version := "0.1"

scalaVersion := "2.13.13"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.8.5",
  "com.typesafe.akka" %% "akka-stream" % "2.8.5"
)

