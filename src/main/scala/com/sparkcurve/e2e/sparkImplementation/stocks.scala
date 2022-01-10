package com.sparkcurve.e2e.sparkImplementation

import com.sparkcurve.e2e.readProperties
import com.sparkcurve.e2e.usefull.usefull._


object stocks {

  def main(args: Array[String]): Unit = {
            println("hi....")
    val propMap=readProperties.readerProperties("com.sparkcurve.e2e.sparkImplementation")

    //val latestMap= latestFolder(propMap,"srcFolder")
    //cleanFolder(propMap)
    println("success")
  }
}

class  stocks {

}
