(def n (read))

(defn mPonderada[x]
    (def valores (repeatedly 3 read))
    (println (format "%.1f" (/ (+ (* (nth valores 0) 2.0) (* (nth valores 1) 3.0) (* (nth valores 2) 5.0)) 10.0)))
    )

(doall (map mPonderada (range 0 n)))