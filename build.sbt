val scala2Version = "2.13.6"
val scala3Version = "3.0.1-RC1"

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",

    scalaVersion := scala2Version,
    crossScalaVersions := Seq(scala2Version, scala3Version),
    scalacOptions += "-feature",
    scalacOptions += "-language:implicitConversions",
    scalacOptions += "-Ydebug",
    scalacOptions += "-Ylog:all",

    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "org.typelevel" %% "algebra" % "2.2.3"
    )
  )
