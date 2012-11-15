set JAVA_OPTS="-client"
jruby-1.6.0\bin\jruby -S cuke4duke -c --jars lib --require bin features %1 %2 %3 %4 | wac.exe
