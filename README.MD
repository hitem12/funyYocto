 # funyYocto
 That project I use to learn how to use Yocto from scratch lets see where we end this
 ### Quick build Yocto image
 ```bash
 docker run -it -v "C:\Users\tomas\Dokumenty\workspace\funyYocto\conf:/home/funy/yocto/output/build/conf" funy bash
. /poky/oe-init-build-env
bitbake core-image-base
```


yocto image is stored in home/funy/tmp/deploy/images/raspberrypi0-wifi