(def dias (read))
(def anosquot (quot dias 365))
(def anosmod (mod dias 365))

(def mesesquot (quot anosmod 30))
(def mesesmod (mod anosmod 30))

(println anosquot "ano(s)")
(println mesesquot "mes(es)")
(println mesesmod "dia(s)")