name := "Proyecto SBT"

scalaVersion := "2.11.8"

lazy val proyecto = FDProject( 
    "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)
