export JAVA_OPTS="-client -d32"
./jruby-1.6.0/bin/jruby -S cuke4duke --jars lib --require bin features $1 $2 $3 $4 $5 $6 $7 $8 
