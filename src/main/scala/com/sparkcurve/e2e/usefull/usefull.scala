package com.sparkcurve.e2e.usefull

import com.databricks.backend.daemon.dbutils.FileInfo
import com.databricks.dbutils_v1.DBUtilsHolder.dbutils

import scala.collection.mutable

object usefull {

  def latestFolder(propMap:mutable.Map[String,String], keys:String*) ={
    keys.foreach(key=>propMap(key)=fsLatest(propMap(key)))
    propMap
  }

  def fsLatest(folderToTest: String) :String= {
    val folderSeq: Seq[FileInfo] = dbutils.fs.ls(folderToTest)
    if (folderSeq.nonEmpty) {
      val sortFolder: FileInfo = folderSeq.filterNot(_.name == "_delta_log/").sortWith(_.path > _.path).head
      if (sortFolder.isDir) fsLatest(sortFolder.path) else sortFolder.path.replace(sortFolder.name, "")
    } else ""

  }
    def cleanFolder(propMap:mutable.Map[String,String]) :Boolean={
      fsClean(propMap("tgtFolder"))
      fsClean(propMap("rejFolder"))
      fsClean(propMap("finalFolder"))
    }

    def fsClean(folderClean: String) :Boolean= dbutils.fs.rm(folderClean,true)

}
