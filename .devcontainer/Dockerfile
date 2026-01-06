FROM ubuntu:24.04
ARG PROJECT_NAME="funy"
#base on https://docs.yoctoproject.org/5.2.2/ref-manual/system-requirements.html#supported-linux-distributions

RUN apt-get update
RUN apt-get install -y build-essential
RUN apt-get install -y chrpath 
RUN apt-get install -y cpio
RUN apt-get install -y debianutils
RUN apt-get install -y diffstat
RUN apt-get install -y file
RUN apt-get install -y gawk
RUN apt-get install -y gcc
RUN apt-get install -y git
RUN apt-get install -y iputils-ping
RUN apt-get install -y libacl1
RUN apt-get install -y liblz4-tool
RUN apt-get install -y locales
RUN apt-get install -y python3
RUN apt-get install -y python3-git
RUN apt-get install -y python3-jinja2
RUN apt-get install -y python3-pexpect
RUN apt-get install -y python3-pip
RUN apt-get install -y python3-subunit
RUN apt-get install -y socat
RUN apt-get install -y texinfo
RUN apt-get install -y unzip
RUN apt-get install -y wget
RUN apt-get install -y xz-utils
RUN apt-get install -y zstd
RUN apt-get install -y python3-websockets
# needed by run qemu 
RUN apt-get install -y iproute2
RUN apt-get install -y sudo 
RUN apt-get install -y iptables
# install packages needed for build project documentation
#RUN apt install -y  git librsvg2-bin locales make python3-saneyaml python3-saneyaml python3-sphinx-rtd-theme sphinx
RUN echo "en_US.UTF-8 UTF-8" >> /etc/locale.gen 
RUN locale-gen
RUN git clone git://git.yoctoproject.org/poky
WORKDIR /poky
RUN git checkout master
RUN scripts/install-buildtools \
  --without-extended-buildtools \
  --base-url https://downloads.yoctoproject.org/releases/yocto \
  --release yocto-5.2.2 \
  --installer-version 5.2.2
# RUN source oe-init-build-env
# RUN git clone https://github.com/agherzan/meta-raspberrypi

# supported by https://embeddeduse.com/2019/02/11/using-docker-containers-for-yocto-builds/
RUN rm /bin/sh && ln -s bash /bin/sh

ENV USER_NAME=${PROJECT_NAME}
ENV PROJECT=${PROJECT_NAME}
ARG host_uid=1001
ARG host_gid=1001
RUN groupadd -g $host_gid $USER_NAME && \
    useradd -g $host_gid -m -s /bin/bash -u $host_uid $USER_NAME 
RUN  adduser ${USER_NAME} sudo
RUN echo "${USER_NAME} ALL=(ALL) NOPASSWD: ALL" >> /etc/sudoers
USER ${USER_NAME}
ENV WORKDIR=/home/$USER_NAME/yocto
RUN mkdir -p $WORKDIR

# ENV BUILD_INPUT_DIR=/home/$USER_NAME/yocto/input
# ENV BUILD_OUTPUT_DIR=/home/$USER_NAME/yocto/output
# RUN mkdir -p $BUILD_INPUT_DIR $BUILD_OUTPUT_DIR
# RUN mkdir -p ${BUILD_OUTPUT_DIR}/build/conf

WORKDIR $WORKDIR
ENV TEMPLATECONF=${WORKDIR}/meta-funy/conf/templates/default

# CMD source ${BUILD_INPUT_DIR}/meta-funy/conf/templates/test-1
#     build && bitbake $PROJECT-image