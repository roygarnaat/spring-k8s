#!/usr/bin/env bash
cd service_1
./build.sh
cd ../service_2
./build.sh
cd ../service_caller
./build.sh
