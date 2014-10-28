(ns ukr-vs-rus.cleanup-ukr)


(defn pick-a-word [line]
  (first (clojure.string/split line #"/|\s")))

(def ukr-orig (slurp "resources/dicts/ukr.txt"))


(def lines (clojure.string/split ukr-orig #"\n"))


(def ukr-words (map pick-a-word lines))
