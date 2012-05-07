(ns noir-ring-request.server
  (:require [noir.server :as server]
    [noir-ring-request.views.common]
    [noir-ring-request.views.index])
  (:gen-class))

(server/load-views "src/noir_ring_request/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'noir-ring-request})))

