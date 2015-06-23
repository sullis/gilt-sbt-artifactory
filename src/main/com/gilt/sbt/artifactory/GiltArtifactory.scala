package com.gilt.sbt.artifactory

import sbt._

object GiltArtifactory extends AutoPlugin {
  override def trigger = allRequirements

  override def requires = empty

  private lazy val defaultIvyPattern = Patterns(
    ivyPatterns = List("[organisation]/[module]/(scala_[scalaVersion]/)(sbt_[sbtVersion]/)[revision]/ivy-[revision].xml"),
    artifactPatterns = List("[organisation]/[module]/(scala_[scalaVersion]/)(sbt_[sbtVersion]/)[revision]/[artifact]-[revision](-[classifier]).[ext]"),
    isMavenCompatible = true
  )

  override def projectSettings = Seq(
    credentials += Credentials("Artifactory Realm", "giltgroupe.artifactoryonline.com", System.getenv("ART_USER"), System.getenv("ART_PASS"))

    resolvers := Seq(
      DefaultMavenRepository,
      Resolver.url("Typesafe Cache", url("http://giltgroupe.artifactoryonline.com/giltgroupe/typesafe.releases")),
      Resolver.url("Gilt Common Cache", url("http://giltgroupe.artifactoryonline.com/giltgroupe/gilt.common"))(defaultIvyPattern),
      Resolver.url("Gilt Internal Releases Cache", url("http://giltgroupe.artifactoryonline.com/giltgroupe/gilt.internal.releases"))(defaultIvyPattern),
      Resolver.url("Gilt Internal Snapshots Cache", url("http://giltgroupe.artifactoryonline.com/giltgroupe/gilt.internal.snapshots"))(defaultIvyPattern),
      Resolver.url("SBT Plugin Releases Cache", url("http://giltgroupe.artifactoryonline.com/giltgroupe/sbt-plugin-releases"))(defaultIvyPattern),
      Resolver.typesafeRepo("releases"),
      Resolver.typesafeIvyRepo("releases"),
      Resolver.bintrayRepo("giltgroupe", "maven"),
      Resolver.bintrayRepo("scalaz", "releases")
    )
  )
}
