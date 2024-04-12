(def valores (repeatedly 3 read))

(def sortSimples (sort <[(nth valores 0) (nth valores 1) (nth valores 2)]))

(println (format "%d\n%d\n%d\n\n%d\n%d\n%d\n" (nth sortSimples 0) (nth sortSimples 1) (nth sortSimples 2) (nth valores 0) (nth valores 1) (nth valores 2)))