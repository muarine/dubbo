#!/bin/bash

APP_HOME=../
#JAVA_HOME=/usr/local/java

PRG="$0"

while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done

PRGDIR=`dirname "$PRG"`

[ -z "$APP_HOME" ] && APP_HOME=`cd "$PRGDIR/.." >/dev/null; pwd`

echo "Using JAVA_HOME:       $JAVA_HOME"
echo "Using APP_HOME:        $APP_HOME"

echo using Java $JAVA_HOME/bin/java
PATH=$PATH:$JAVA_HOME/bin
export PATH

APP_CONF=$APP_HOME/conf
APP_BIN=$APP_HOME/bin
APP_LIB=$APP_HOME/lib
APP_LOG=$APP_HOME/logs

CLASSPATH=$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar

cd $APP_LIB

for l in `ls`
do
    CLASSPATH=$CLASSPATH:$APP_LIB/$l
done

cd $APP_CONF

CLASSPATH=$APP_BIN/dubboserver.jar:$CLASSPATH

ulimit -n 1024

$JAVA_HOME/bin/java -Dfile.encoding=UTF-8 -classpath .:$CLASSPATH com.muarine.dubbo.main.Main INSTANCE 1>$APP_LOG/log.log 2>$APP_LOG/logerror.log &
echo $! > $APP_BIN/dubboserver.pid
echo started, pid is : $!
