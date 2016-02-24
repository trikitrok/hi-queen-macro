(ns hi-queen.core)

(defmacro def-hi-queen [name intro-formula]
  (list 'defn
        (symbol (str (clojure.string/lower-case (clojure.string/replace name #"\s" "-")) "-hi-queen"))
        []
        (list 'hi-queen (str intro-formula " " name))))

(defn hi-queen [introduction]
  (str introduction ", so please your Majesty"))

(def-hi-queen "Alice" "My name is")
(def-hi-queen "March Hare" "My name is")

(defn white-rabbit-hi-queen []
  (hi-queen "I'm the White Rabbit"))

(defn mad-hatter-hi-queen []
  (hi-queen "I'm the Mad Hatter"))
