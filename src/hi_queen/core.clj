(ns hi-queen.core)

(defn hi-queen-fn-name [character-name]
  (-> character-name
      (clojure.string/replace #"\s" "-")
      (clojure.string/lower-case)
      (str "-hi-queen")))

(defn hi-queen [introduction]
  (str introduction ", so please your Majesty"))

(defmacro def-hi-queen [intro-formula name]
  `(defn ~(symbol (hi-queen-fn-name name))
        []
        (hi-queen ~(str intro-formula " " name))))

(def-hi-queen "My name is" "Alice")
(def-hi-queen "My name is" "March Hare")
(def-hi-queen  "I'm the" "White Rabbit")
(def-hi-queen "I'm the" "Mad Hatter")
