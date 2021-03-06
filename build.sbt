enablePlugins(AndroidLib)

organization := "com.malliina"
version := "0.1.1"
scalaVersion := "2.11.12"
fork in Test := true
libraryDependencies ++= Seq("com.malliina" %% "util-android" % "0.12.5")
//packageAar := packageAar in Android

platformTarget in Android := "android-27"
useProguard in Android := true
libraryProject := true
typedResourcesAar := true
