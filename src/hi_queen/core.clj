(ns hi-queen.core)

(defn hi-queen [introduction]
  (str introduction ", so please your Majesty"))

(defn alice-hi-queen []
  (hi-queen "My name is Alice"))

(defn march-hare-hi-queen []
  (hi-queen "My name is March Hare"))

(defn white-rabbit-hi-queen []
  (hi-queen "I'm the White Rabbit"))