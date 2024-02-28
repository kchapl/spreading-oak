lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  guice,
  "dev.zio"                %% "zio"                % "1.0.18",
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
)
