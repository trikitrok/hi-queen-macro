(ns hi-queen.core-test
  (:require [midje.sweet :refer :all]
            [hi-queen.core :refer :all]))

(facts "about saying hi to the queen"
  (fact
    "Alice says it"
    (alice-hi-queen) => "My name is Alice, so please your Majesty"))
