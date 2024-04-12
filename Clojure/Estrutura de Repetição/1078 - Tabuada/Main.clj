(def n (read))
(defn multi[x]
    (println (format "%d x %d = %d" x n (* x n))))
(doall (map multi (range 1 11)))