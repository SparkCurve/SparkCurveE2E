package com.sparkcurve.e2e.sparkImplementation

import com.sparkcurve.e2e.{aCommonTrait, readProperties}
import com.sparkcurve.e2e.spark.SessionGet
import com.sparkcurve.e2e.usefull.usefull._
import org.apache.spark.sql.{DataFrame, SparkSession}

import scala.collection.mutable


object stocks extends SessionGet {

  def main(args: Array[String]): Unit = {
    println("hi....")
    val propMap=readProperties.readerProperties("com.sparkcurve.e2e.sparkImplementation")

    //val latestMap= latestFolder(propMap,"srcFolder")
    //cleanFolder(propMap)
    val stocks =new stocks(propMap,spark)
    stocks.aCommonTransformation(spark)
    println("success")
  }
}

class  stocks (val propMap:mutable.Map[String,String],val spark:SparkSession) extends aCommonTrait{

  override def prepareSrcDF: DataFrame = ???
}
