(ns ukr-vs-rus.analyze
  (:require [ukr-vs-rus.cleanup-ukr :as ukr-words]
            [ukr-vs-rus.cleanup-rus :as rus-words]
            [ukr-vs-rus.transliteration-ukr :as ukr-tr]
            [ukr-vs-rus.transliteration-rus :as rus-tr]))


(def ukr-transliterated (set (map ukr-tr/transliterate ukr-words/ukr-words)))
(def rus-transliterated (set (map rus-tr/transliterate rus-words/rus-words)))

(def same-words-count (count (clojure.set/intersection ukr-transliterated rus-transliterated)))

(count ukr-words/ukr-words)
(count rus-words/rus-words)

(* 100 (double (/ same-words-count (count ukr-transliterated))))
(count rus-transliterated)

;same-words-count

