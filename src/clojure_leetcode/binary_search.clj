(ns clojure-leetcode.binary-search
  "----------- 704. Binary Search -------------
  https://leetcode.com/problems/binary-search/")

(defn binary-search
  "Return the index of the target or nil if not found.

  If the collection contains duplicates, the returned 
  index is not guaranteed to be that of the first occurrence."
  [coll target]
  (when (and (seq coll) target)
    (loop [start 0
           end (dec (count coll))]
      (when (<= start end)
        (let [mid (quot (+ start end) 2)
              mid-val (nth coll mid)]
          (cond
            (= target mid-val) mid
            (< target mid-val) (recur start (dec mid))
            :else (recur (inc mid) end)))))))
