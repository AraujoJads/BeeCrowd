(def n (read))

(defn pum[x]
    (if (= (mod x 4) 0)
                 (print "PUM\n")
                 (print (format "%d " x)))
    )

(doall (map pum (range 1 (+ (* n 4) 1))))