docker restart `docker ps -a | sed -n 2p | awk '{print $1;}'`
docker -D info

