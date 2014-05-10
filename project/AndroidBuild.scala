import sbt._
import sbt.Keys._
import android.Keys._

/**
 * The build.
 */
object AndroidBuild extends Build {
  lazy val andresProject = Project("android-utils", file(".")).settings(projectSettings: _*)

  lazy val projectSettings: Seq[Setting[_]] = android.Plugin.androidBuildAar ++ androidSettings ++ Seq(
    version := "0.0.4",
    scalaVersion := "2.10.4",
    fork in Test := true,
    libraryDependencies ++= Seq("com.github.malliina" %% "util-android" % "0.7.5"),
    packageAar <<= packageAar in Android
  )

  def androidSettings = Seq(
    platformTarget in Android := "android-19",
    useProguard in Android := true,
    libraryProject := true
  )
}