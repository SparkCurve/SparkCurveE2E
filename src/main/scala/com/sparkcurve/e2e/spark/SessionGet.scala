package com.sparkcurve.e2e.spark

import org.apache.spark.sql.SparkSession

trait SessionGet {

  lazy val spark : SparkSession= {
    SparkSession
      .builder()
      .config("spark.sql.extensions", "io.delta.sql.DeltaSparkSessionExtension")
      .config("spark.sql.catalog.spark_catalog", "org.apache.spark.sql.delta.catalog.DeltaCatalog")
      .master("local[*]")
      .appName("Spark Curve E2E")
      .getOrCreate()
  }
}
