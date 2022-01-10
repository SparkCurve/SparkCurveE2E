package com.sparkcurve.e2e

import com.typesafe.config.ConfigFactory
import scala.collection.mutable

object readProperties {

  def readerProperties(path:String) : mutable.Map[String,String]={
    ConfigFactory.invalidateCaches()
    val properties=ConfigFactory.load().getConfig(path)
    val propMap: mutable.Map[String,String]=mutable.Map()
    properties.entrySet().forEach(entry=> propMap.put(entry.getKey,entry.getValue.unwrapped().toString))
    println(propMap)
    propMap
  }
}
