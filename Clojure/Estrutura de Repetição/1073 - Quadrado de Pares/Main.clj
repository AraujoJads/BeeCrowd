(def n (read))

(defn quad[x]
    (println (format "%d^2 = %d" x (* x x)))
    )
(doall (map quad (range 2 (+ n 1) 2)))