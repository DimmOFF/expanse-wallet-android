cmake_minimum_required(VERSION 3.4.1)

add_library(keys SHARED
            keys.c)

#SET(CMAKE_CXX_FLAGS  "${CMAKE_CXX_FLAGS} -DCMAKE_CXX_STANDARD=17")

# Include libraries needed for native-lib lib
target_link_libraries(keys
                      android
                      log)
