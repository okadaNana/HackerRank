#!/bin/python3

import sys

# 12:00:00AM --> 00:00:00
# 12:34:56AM --> 00:34:56

# 12:00:00PM --> 12:00:00
# 12:34:56PM --> 12:34:56

time = input().strip()

AM = time[-2] == 'A'
time = time[:-2].split(':') 
hour = int(time[0])

if hour is 12:
    if AM:
        print('00:' + time[1] + ':' + time[2])
    else:  
        print('12:' + time[1] + ':' + time[2])
else:
    if AM:
        print(':'.join(time))
    else:
        print(('%02d' + ':' + time[1] + ':' + time[2]) % (hour+12))
    
