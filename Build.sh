my_docker="yocto_builder_l"
input_path="/home/funy/yocto/input"
output_path="/home/funy/yocto/output/build"
docker_username="funy"
docker run \
--device=/dev/net/tun:/dev/net/tun \
--cap-add NET_ADMIN \
--name $my_docker -t -d  \
--mount "type=bind,src=.,dst=$input_path" \
--mount "type=bind,src=.,dst=$output_path" \
funy 
# -v "${PWD:-.}/windows:/storage" \



# docker exec -u 0 $my_docker chown -R $docker_username:$docker_username $output_path
# docker exec -u 0 $my_docker chown -R $docker_username:$docker_username $input_path