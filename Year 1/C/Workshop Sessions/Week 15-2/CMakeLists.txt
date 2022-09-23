cmake_minimum_required(VERSION 3.10)

project(lab15b)

find_package(fmt)

add_executable(main01 main01.cpp)
target_link_libraries(main01 fmt::fmt-header-only)

add_executable(main02 main02.cpp)
target_link_libraries(main02 fmt::fmt-header-only)

set_target_properties(
  main01 main02
  PROPERTIES
  C_STANDARD 11
  C_STANDARD_REQUIRED YES
  C_EXTENSIONS NO
  CXX_STANDARD 17
  CXX_STANDARD_REQUIRED YES
  CXX_EXTENSIONS NO)

if (MSVC)
  add_compile_options(/Wall /WX)
else()
  add_compile_options(-Wall -Wextra)
endif()

add_custom_command(
  OUTPUT ${CMAKE_CURRENT_BINARY_DIR}/students.txt
  COMMAND ${CMAKE_COMMAND} -E copy
    ${CMAKE_CURRENT_SOURCE_DIR}/students.txt
    ${CMAKE_CURRENT_BINARY_DIR}/students.txt
  DEPENDS students.txt)

add_custom_target(
  data1 ALL DEPENDS ${CMAKE_CURRENT_BINARY_DIR}/students.txt)

add_custom_command(
  OUTPUT ${CMAKE_CURRENT_BINARY_DIR}/input1.txt
  COMMAND ${CMAKE_COMMAND} -E copy
    ${CMAKE_CURRENT_SOURCE_DIR}/input1.txt
    ${CMAKE_CURRENT_BINARY_DIR}/input1.txt
  DEPENDS input1.txt)

add_custom_target(
  data2 ALL DEPENDS ${CMAKE_CURRENT_BINARY_DIR}/input1.txt)
