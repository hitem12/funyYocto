$my_docker = "yocto_builder"
$input_path = "/home/funy/yocto/output/build/conf"
$output_path = "/home/funy/yocto/output/build"
$docker_username = "funy"
docker run `
--name $my_docker -t -d  `
--mount "type=bind,src=C:\Users\tomas\Dokumenty\workspace\funyYocto,dst=$output_path" `
funy 
# docker exec  $my_docker 
# docker exec -u 0 $my_docker chown $docker_username $input_path
docker exec -u 0 $my_docker chown $docker_username $output_path