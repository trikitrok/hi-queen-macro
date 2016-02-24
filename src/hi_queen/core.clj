(ns hi-queen.core)

(defn hi-queen-fn-name [character-name]
  (-> character-name
      (clojure.string/replace #"\s" "-")
      (clojure.string/lower-case)
      (str "-hi-queen")))

(defn hi-queen [introduction]
  (str introduction ", so please your Majesty"))

(defmacro def-hi-queen [name intro-formula]
  (list 'defn
        (symbol (hi-queen-fn-name name))
        []
        (list 'hi-queen (str intro-formula " " name))))

(def-hi-queen "Alice" "My name is")
(def-hi-queen "March Hare" "My name is")
(def-hi-queen "White Rabbit" "I'm the")
(def-hi-queen "Mad Hatter" "I'm the")
