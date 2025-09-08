$my_docker = "yocto_builder"
$input_path = "/home/funy/yocto/input"
$output_path = "/home/funy/yocto/output/build"
$docker_username = "funy"
docker run `
--name $my_docker -t -d  `
--mount "type=bind,src=C:\Users\tomas\Dokumenty\workspace\funyYocto,dst=$input_path" `
--mount "type=bind,src=C:\Users\tomas\Dokumenty\workspace\funyYocto,dst=$output_path" `
funy 
docker exec -u 0 $my_docker chown $docker_username $output_path
docker exec -u 0 $my_docker chown $docker_username $input_path