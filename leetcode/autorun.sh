#!/bin/bash

objpath=$(cd `dirname $0`; pwd)
echo $objpath
make
exec $objpath/linklist
