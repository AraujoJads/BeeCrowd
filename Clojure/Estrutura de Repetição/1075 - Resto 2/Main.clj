(def n (read))
(defn div [x]
    (if (= (mod x n) 2)
        (println x)))
(doall (map div (range 0 10000)))