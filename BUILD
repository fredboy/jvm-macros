load("@io_bazel_rules_scala//scala:scala.bzl", "scala_macro_library", "scala_test")

scala_macro_library(
    name = "jvm-macros",
    srcs = glob([
        "src/main/scala/**/*.java",
        "src/main/scala/**/*.scala",
    ]),
    visibility = ["//visibility:public"],
)

scala_test(
    name = "jvm-macros-test",
    srcs = glob([
        "src/test/scala/**/*.java",
        "src/test/scala/**/*.scala",
    ]),
    deps = [
        ":jvm-macros",
        "@org_scalacheck_scalacheck//jar",
        "@org_scalactic_scalactic//jar:file",
        "@org_scalatest_scalatest//jar:file",
    ],
)
