#!/usr/bin/env bash
echo 'Starting my app'
cd '/tmp'
nohup java -jar GestaoProcessoIndustrial-0.0.1.jar > ./log.txt 2>&1 &
echo $! > ./pid.file