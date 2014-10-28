(ns ukr-vs-rus.cleanup-rus)


(defn pick-a-word [line]
  (first (clojure.string/split line #"/|\s")))

(def rus-orig (slurp "resources/dicts/rus.txt"))


(def lines (clojure.string/split rus-orig #"\n"))


(def rus-words (map pick-a-word lines))


(def rus-words (filter #(> (count %) 1) rus-words))


(defn is-uppercase-word [word]
  (not (Character/isUpperCase (first word))))


(def rus-words (filter is-uppercase-word rus-words))

