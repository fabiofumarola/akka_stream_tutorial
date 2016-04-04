name := "akka_stream_tutorial"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-target:jvm-1.8", "-feature")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io",
  Resolver.sonatypeRepo("public"),
  Resolver.typesafeRepo("releases")
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % "2.4.3"
)