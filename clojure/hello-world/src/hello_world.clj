 (ns hello-world
   (:gen-class))


(defn hello [& name]
  (if name
    (str "Hello, " (first name) "!")
    (str "Hello, World!")))