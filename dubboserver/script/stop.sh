#!/bin/sh
DUBBOSERVER_PIDFILE=$(grep dataDir "./" | sed -e 's/.*=//')/dubboserver.pid
echo "Stopping DubboServer ... "
if [ ! -f "$DUBBOSERVER_PIDFILE" ]
then
echo "error: could not find file $DUBBOSERVER_PIDFILE"
exit 1
else
$KILL -9 $(cat "$ZOOPIDFILE")
rm "$ZOOPIDFILE"
echo STOPPED
fi
;;
