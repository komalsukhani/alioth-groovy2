#!/bin/sh -e

# called by uscan with '--upstream-version' <version> <file>
TAR=../groovy2_$2+dfsg.orig.tar.gz
DIR=groovy-$2

# clean up the upstream tarball
unzip $3
rm -rf $DIR/build
GZIP=--best tar -c -z -f $TAR --exclude '*.jar' --exclude '*.pdf' --exclude '*.class' $DIR --numeric-owner --owner 0 --group 0
rm -rf $3 $DIR

# move to directory 'tarballs'
if [ -r .svn/deb-layout ]; then
  . .svn/deb-layout
  mv $TAR $origDir
  echo "moved $TAR to $origDir"
fi
