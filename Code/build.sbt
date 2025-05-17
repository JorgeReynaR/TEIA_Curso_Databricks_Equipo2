ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "EstatusPago"
  )

libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.19" % "test"
