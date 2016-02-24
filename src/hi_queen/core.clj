(ns hi-queen.core)

(defmacro def-hi-queen [name intro-formula]
  (list 'defn
        (symbol (str (clojure.string/lower-case name) "-hi-queen"))
        []
        (list 'hi-queen (str intro-formula " " name))))

(defn hi-queen [introduction]
  (str introduction ", so please your Majesty"))

(def-hi-queen "Alice" "My name is")

(defn march-hare-hi-queen []
  (hi-queen "My name is March Hare"))

(defn white-rabbit-hi-queen []
  (hi-queen "I'm the White Rabbit"))

(defn mad-hatter-hi-queen []
  (hi-queen "I'm the Mad Hatter"))
