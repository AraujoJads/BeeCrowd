(def n (repeatedly 2 read))
(def ord (sort n))

(defn resto[x]
    (if (or(= (mod x 5) 2) (= (mod x 5) 3))
        (println x))
    )

(doall (map resto (range (+(nth ord 0) 1) (nth ord 1))))