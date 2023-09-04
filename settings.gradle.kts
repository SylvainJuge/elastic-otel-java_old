pluginManagement {
  repositories {
    gradlePluginPortal()
    maven {
      name = "sonatype"
      url = uri("https://oss.sonatype.org/content/repositories/snapshots")
    }
  }
}

rootProject.name = "otel-java-instrumentation"
include("extension")
include("test-app")