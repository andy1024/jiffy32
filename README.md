# jiffy32
##Description
![Alt text](https://raw.githubusercontent.com/andy1024/jiffy32/master/images/ff32chip-on-homebrew-board.jpg "Self-made board with FF32 chip connected to PCF8591")
######Self-made board with FF32 chip connected to PCF8591
A java library intended for interfacing with FlyFish Technologies FF32 General Purpose Input Output USB dongle

http://www.flyfish-tech.com/FF32/index.php

This code is based on "FF32 demo" written in C and published to the Public Domain

## Credits
Engineering team at FlyFish Technologies for FF32 chip

Original author of FF32 C library for codebase

Codeminders for their [javahidapi](https://code.google.com/p/javahidapi/)

Guy Carpenter for his [py-gaugatte](http://guy.carpenter.id.au/gaugette/) code

## Build
Building process is handled by maven tool, which takes care of dependencies needed by this project
```shell
    mvn clean
    mvn compile
```

## Usage
In order to run this package you need to FF32 from FlyFish Technologies and proper privileges to run the code.
You can achieve it by running it as root (bad practice) or add a udev rule like this:
```
sudo echo 'SUBSYSTEMS=="usb", ATTRS{idVendor}=="04d8", ATTRS{idProduct}=="f8b9", MODE:="0666"
KERNEL=="hiddev*", ATTRS{idVendor}=="04d8", ATTRS{idProduct}=="f8b9", MODE:="0666"' >/etc/udev/rules.d/50-hid.rules
sudo udevadm control --reload-rules
sudo udevadm trigger
```
This should be done only once.
Example usage can be found in org.warheim.interfacing.jiffy32.JiffyTest class. Protoboard wiring example will follow shortly.

![Alt text](https://raw.githubusercontent.com/andy1024/jiffy32/master/images/pfcjif-screenshot.png?raw=true "Self-made board with FF32 chip connected to PCF8591")
######Screenshot from jiffy32 demo using PCF8591 breakout board. Written in Processing


## Current project status
Work in progress

Basic calls are working (dongle metadata, digital, analog and pwm single and mutliple pin i/o requests)

i2c calls are working (tested with PCF8591 chip)

SPI and 1-Wire calls are implemented, but not tested yet

Library supports multiple dongles attached simultaneously

No optimization has been done yet 

[Current bugs](https://github.com/andy1024/jiffy32/issues?q=is%3Aopen+is%3Aissue+label%3Abug)

[Enhancements planned](https://github.com/andy1024/jiffy32/issues?q=is%3Aopen+is%3Aissue+label%3Aenhancement)
