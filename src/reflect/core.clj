(ns reflect.core)

#_(~'goog.object/get (~'js-obj) "hello")

(defmacro use-reflect []
  `(prn (~'goog.reflect/objectProperty "hello" (~'js-obj))))