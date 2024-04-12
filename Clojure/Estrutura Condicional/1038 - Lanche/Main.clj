(def valores (repeatedly 2 read))

(cond 
    (= (nth valores 0) 1) (println (format "Total: R$ %.2f" (* 4.00 (nth valores 1))))
    (= (nth valores 0) 2) (println (format "Total: R$ %.2f" (* 4.50 (nth valores 1))))
    (= (nth valores 0) 3) (println (format "Total: R$ %.2f" (* 5.00 (nth valores 1))))
    (= (nth valores 0) 4) (println (format "Total: R$ %.2f" (* 2.00 (nth valores 1))))
    (= (nth valores 0) 5) (println (format "Total: R$ %.2f" (* 1.50 (nth valores 1))))
    )