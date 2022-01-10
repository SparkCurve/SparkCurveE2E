package com.sparkcurve.e2e

import org.apache.spark.sql.{DataFrame, SparkSession}

trait aCommonTrait {

  def prepareSrcDF :DataFrame
  def transformDF(srcDF:DataFrame):DataFrame={

    srcDF
    }


  def aCommonTransformation(spark:SparkSession): Unit = {
    val srcDF=prepareSrcDF
    val transDF=transformDF(srcDF)
  }
}
