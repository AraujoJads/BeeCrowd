(def valores (repeatedly 4 read))

(cond
    (and(> (nth valores 1) (nth valores 2)) 
    (> (nth valores 3) (nth valores 0))
    (> (+ (nth valores 2) (nth valores 3)) (+ (nth valores 0) (nth valores 1)))
    (>= (nth valores 2) 0) (>= (nth valores 3) 0)
    (even? (nth valores 0))) (printf "Valores aceitos")
    :else (printf "Valores nao aceitos"))
