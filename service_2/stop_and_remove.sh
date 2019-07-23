#!/usr/bin/env bash
docker stop $(docker ps -a -q  --filter ancestor=leonelcs/service_2:latest)
docker rm $(docker ps -a -q  --filter ancestor=leonelcs/service_2:latest)
