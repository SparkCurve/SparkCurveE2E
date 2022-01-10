name := "SparkCurveE2E"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "3.0.1" % "provided",
  "com.typesafe" % "config" % "1.4.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.databricks" %% "dbutils-api" % "0.0.5",
  "io.delta" %% "delta-core" % "0.8.0"
)

Test / testForkedParallel := true
