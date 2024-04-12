(def n (read))

(defn divisao[n]
    (def x (read))
    (def y (read))
    (if (= y 0)
        (println "divisao impossivel")
        (println (format "%.1f" (double (/ x y))))))

(doall (map divisao (range 0 n 1)))