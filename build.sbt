lazy val root = (project in file(".")).
  settings(
      name := "scarlsen",
      version := "1.0",
      scalaVersion := "2.11.5"
  )

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.2" % "test"
