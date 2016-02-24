(ns hi-queen.core-test
  (:require [midje.sweet :refer :all]
            [hi-queen.core :refer :all]))

(facts
  "about Saying hi to the queen"

  (fact
    "Alice says it"
    (alice-hi-queen) => "My name is Alice, so please your Majesty")

  (fact
    "March Hare says it"
    (march-hare-hi-queen) => "My name is March Hare, so please your Majesty")

  (fact
    "White Rabbit says it"
    (white-rabbit-hi-queen) => "I'm the White Rabbit, so please your Majesty")

  (fact
    "Mad Hatter says it"
    (mad-hatter-hi-queen) => "I'm the Mad Hatter, so please your Majesty"))
