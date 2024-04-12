(def timer (read))

(def horas (quot timer 3600))
(def resthoras (mod timer 3600))

(def minutos (quot resthoras 60))
(def restminutos (mod resthoras 60))

(println (str horas":"minutos":"restminutos))