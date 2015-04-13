(ns helloclojure.test
  (:use midje.sweet, helloclojure.core))

(fact (testfn "world") => "Hello world")
