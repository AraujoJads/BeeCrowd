(def n (read))

(defn test[x]
    (def m (read))
    (cond
        (= m 0) (println "NULL")
        (even? m) (if (> m 0)
                      (println "EVEN POSITIVE")
                      (println "EVEN NEGATIVE"))
        (odd? m) (if (> m 0)
                     (println "ODD POSITIVE")
                     (println "ODD NEGATIVE"))))
(doall (map test (range 0 n)))