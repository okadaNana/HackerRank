#!/bin/python

import sys


n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))
print "%.6f" % (sum(i > 0 for i in arr) * 1.0 / n)
print "%.6f" % (sum(i < 0 for i in arr) * 1.0 / n)
print "%.6f" % (sum(i == 0 for i in arr) * 1.0 / n)