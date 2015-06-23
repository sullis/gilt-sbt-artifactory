# gilt-sbt-artifactory
SBT Plugin to add Gilt Artifactory resolvers in a maintainable way for many sbt projects to use.

# Installation

Add the following to your `project/plugins.sbt` file:

    resolvers += Resolver.url("myyk-bintray-sbt-plugins", url("https://dl.bintray.com/myyk/sbt-plugins/"))(Resolver.ivyStylePatterns)
    addSbtPlugin("com.github.myyk" % "gilt-sbt-artifactory" % "0.0.1")
