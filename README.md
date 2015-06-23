# gilt-sbt-artifactory
SBT Plugin to add Gilt Artifactory resolvers in a maintainable way for many sbt projects to use.

[![Build Status](https://travis-ci.org/myyk/gilt-sbt-artifactory.svg)](https://travis-ci.org/myyk/gilt-sbt-artifactory)
[![Codacy Badge](https://www.codacy.com/project/badge/cfaebbf9c0a54375a00d29c22ec0312e)](https://www.codacy.com/app/myykseok/gilt-sbt-artifactory)

# Installation

Add the following to your `project/plugins.sbt` file:

    resolvers += Resolver.url("myyk-bintray-sbt-plugins", url("https://dl.bintray.com/myyk/sbt-plugins/"))(Resolver.ivyStylePatterns)
    addSbtPlugin("com.github.myyk" % "gilt-sbt-artifactory" % "0.0.1")
