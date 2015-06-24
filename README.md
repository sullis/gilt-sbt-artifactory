# gilt-sbt-artifactory
SBT Plugin to add Gilt Artifactory resolvers in a maintainable way for many sbt projects to use.

[![Build Status](https://travis-ci.org/myyk/gilt-sbt-artifactory.svg)](https://travis-ci.org/myyk/gilt-sbt-artifactory)
[![Codacy Badge](https://www.codacy.com/project/badge/cfaebbf9c0a54375a00d29c22ec0312e)](https://www.codacy.com/app/myykseok/gilt-sbt-artifactory)

# Installation

Add the following to your `project/plugins.sbt` file:

    resolvers += Resolver.url("myyk-bintray-sbt-plugins", url("https://dl.bintray.com/myyk/sbt-plugins/"))(Resolver.ivyStylePatterns)
    addSbtPlugin("com.github.myyk" % "gilt-sbt-artifactory" % "0.0.4")

If plugins aren't resolving try to put the same lines from above in `project/project/plugins.sbt`.

# Credentials

User name and passwords for Artifactory are passed in through environment variables, `ART_USER` and `ART_PASS`. You could set them like this on a Unix OS.

    export ART_USER=my-username
    export ART_PASS=my-password

This allows us to use the same mechanism in Travis by using the `travis` Ruby gem to add encrypted credentials to the `.travis.yml` for your project.

    travis encrypt ART_USER=travis --add env.global
    travis encrypt ART_PASS=password --add env.global
