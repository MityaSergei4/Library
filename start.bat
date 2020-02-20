@rem CONTENT OF BATCH FILE
@echo off
@cls
SET JAVA_HOME=jdk
SET CLASSPATH=.;%JAVA_HOME%
SET PATH=%PATH%;%JAVA_HOME%\bin
@echo off
start javaw -jar -Xms1024m -Xmx1024m Quiz.jar