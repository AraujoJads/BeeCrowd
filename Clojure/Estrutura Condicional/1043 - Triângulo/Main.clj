(def a (read))
(def b (read))
(def c (read))

(cond (and (< a (+ b c)) (< b (+ a c)) (< c (+ a b)))
         (println (format "Perimetro = %.1f" (+ a b c))) 
:else(println(format "Area = %.1f"  (/ (* c (+ a b)) 2))))
