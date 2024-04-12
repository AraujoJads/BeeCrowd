(def n (read))

(doall(if (even? n)
          (map println (range (+ n 1) (+ n 13) 2))
          (map println (range n (+ n 12) 2))
          )
      )
