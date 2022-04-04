load("@io_bazel_rules_scala//scala:scala.bzl", "scala_test", "scala_binary")

scala_binary(
  name = "binary",
  main_class = "Main",
  srcs = glob(["src/main/scala/**/*.scala"]),
  deps = [
  ] 
)

scala_test(
  name = "demo",
  srcs = glob(["src/test/scala/**/*.scala"]),
  deps = [
    "binary"
  ] 
)