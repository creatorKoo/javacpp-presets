#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" imagemagick
    popd
    exit
fi

if [[ $PLATFORM == windows-x86_64 ]]; then
    IMAGEMAGICK_VERSION=7.0.7-27
    mkdir -p $PLATFORM
    cd $PLATFORM
    mkdir -p installer
    cd installer
    download https://www.imagemagick.org/download/binaries/ImageMagick-7.0.7-27-Q16-x64-dll.exe imagemagick$IMAGEMAGICK_VERSION.exe
    #./imagemagick$IMAGEMAGICK_VERSION.exe
else
    echo "NOT SUPPORT YET ERROR"
fi

case $PLATFORM in
    windows-x86_64)
        cp -r "C:\\Program Files\\ImageMagick-7.0.7-Q16\\include" ../
        cp -r "C:\\Program Files\\ImageMagick-7.0.7-Q16\\lib" ../
        mkdir -p ../bin
        cp -r C:/"Program Files"/"ImageMagick-7.0.7-Q16"/*.dll ../bin/
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..