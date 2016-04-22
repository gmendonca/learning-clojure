 (ns bob
   (:require [clojure.string :as string])
   (:gen-class))


 (defn upper-case-checker [response]
   (if (= (string/join " " (re-seq  #"[a-zA-z]+" response)) "")
     false
     (if (= (.toUpperCase (string/join " " (re-seq  #"[a-zA-z]+" response)))
            (string/join " " (re-seq  #"[a-zA-z]+" response)))
       "Whoa, chill out!"
       false))
   )

(defn response-for [response]
  (cond
    (= (.trim response) "") "Fine. Be that way!"
    (upper-case-checker response) "Whoa, chill out!"
    (= (last response) \?) "Sure."
    :else "Whatever."))