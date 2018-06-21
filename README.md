# MyDexDemo
Android 动态加载dex的小demo


rm -rf build app/build
bash ./gradlew build makeJar
dx --dex --output=./app/src/main/assets/dynamic_dex.jar ./app/build/libs/dynamic.jar
bash ./gradlew build iD


