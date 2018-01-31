releasePublishArtifactsAction := PgpKeys.publishSigned.value

name := "gilt-sbt-artifactory"

organization := "com.github.myyk"

sbtPlugin := true

crossSbtVersions := Vector("0.13.16", "1.1.0")

bintrayPackageLabels := Seq("artifactory")

scalacOptions ++= Seq(
  "-language:postfixOps",
  "-feature"
)

homepage := Some(url("https://github.com/gilt/gilt-sbt-artifactory"))

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

pomExtra := (
  <scm>
    <url>https://github.com/myyk/gilt-sbt-artifactory.git</url>
    <connection>scm:git:git@github.com:myyk/gilt-sbt-artifactory.git</connection>
  </scm>
  <developers>
    <developer>
      <id>myyk</id>
      <name>Myyk Seok</name>
      <url>https://github.com/myyk</url>
    </developer>
  </developers>
)
